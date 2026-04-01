package com.example.service;

import com.example.dto.CharacterResponse;
import com.example.entity.GameCharacter;

import com.example.exception.CustomException;
import com.example.exception.ErrorCode;

import com.example.repository.GameCharacterRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Optional;

/**
 * 角色服務層
 * 負責從資料庫讀取快取資料，若無則呼叫 Nexon API 取得角色資訊
 */
@Service
public class CharacterService {

    // 角色資料存取元件，負責資料庫 CRUD
    private final GameCharacterRepository gameCharacterRepository;

    // 從 application.properties 讀取 Nexon API Key
    @Value("${nexon.api.key}")
    private String apiKey;

    public CharacterService(GameCharacterRepository gameCharacterRepository) {
        this.gameCharacterRepository = gameCharacterRepository;
    }

    /**
     * 取得指定角色名稱的角色資料
     * 1. 先從本地資料庫快取讀取
     * 2. 找不到時，呼叫 Nexon API 查詢 ocid，再取得角色基本資料
     */
    public CharacterResponse getCharacter(String name) {
        Optional<GameCharacter> savedCharacter = gameCharacterRepository.findByCharacterName(name);

        // 如果資料已存在，直接回傳快取資料
        if (savedCharacter.isPresent()) {

            System.out.println("從快取取得角色資料：" + name);
            GameCharacter gameCharacter = savedCharacter.get();

            CharacterResponse cachedResponse = new CharacterResponse();
            cachedResponse.setCharacterName(gameCharacter.getCharacterName());
            cachedResponse.setWorldName(gameCharacter.getWorldName());
            cachedResponse.setCharacterClass(gameCharacter.getCharacterClass());
            cachedResponse.setCharacterLevel(gameCharacter.getCharacterLevel());
            cachedResponse.setCharacterGuildName(gameCharacter.getGuildName());
            cachedResponse.setCharacterImage(gameCharacter.getCharacterImage());

            return cachedResponse;
        }

        // 尚未命中快取，使用 RestTemplate 呼叫 Nexon API
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-nxopen-api-key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);

        try {
            String idUrl = "https://open.api.nexon.com/maplestorytw/v1/id?character_name=" + name;

            ResponseEntity<Map> idResponse = restTemplate.exchange(
                    idUrl,
                    HttpMethod.GET,
                    entity,
                    Map.class);

            Map body = idResponse.getBody();
            System.out.println("API 回傳資料：" + body);
            if (body == null || body.get("ocid") == null) {
                throw new CustomException(ErrorCode.CHARACTER_NOT_FOUND);
            }

            String ocid = (String) body.get("ocid");

            String basicUrl = "https://open.api.nexon.com/maplestorytw/v1/character/basic?ocid=" + ocid;

            ResponseEntity<CharacterResponse> response = restTemplate.exchange(
                    basicUrl,
                    HttpMethod.GET,
                    entity,
                    CharacterResponse.class);

            CharacterResponse characterResponse = response.getBody();

            if (characterResponse == null) {
                throw new CustomException(ErrorCode.EXTERNAL_API_ERROR);
            }

            saveCharacter(characterResponse, ocid);
            return characterResponse;

        } catch (CustomException ex) {
            throw ex;
        } catch (RestClientException ex) {
            throw new CustomException(ErrorCode.EXTERNAL_API_ERROR);
        }
    }

    /**
     * 儲存角色資料到資料庫，若已有相同 ocid 資料則更新
     */
    public void saveCharacter(CharacterResponse response, String ocid) {
        GameCharacter gameCharacter = gameCharacterRepository.findByOcid(ocid)
                .orElse(new GameCharacter());

        gameCharacter.setOcid(ocid);
        gameCharacter.setCharacterName(response.getCharacterName());
        gameCharacter.setWorldName(response.getWorldName());
        gameCharacter.setCharacterClass(response.getCharacterClass());
        gameCharacter.setCharacterLevel(response.getCharacterLevel());
        gameCharacter.setGuildName(response.getCharacterGuildName());
        gameCharacter.setCharacterImage(response.getCharacterImage());

        gameCharacterRepository.save(gameCharacter);
    }
}