package com.example.service;

import com.example.dto.CharacterResponse;
import com.example.entity.GameCharacter;
import com.example.repository.GameCharacterRepository;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Map;
import java.util.Optional;

@Service
public class CharacterService {

    private final GameCharacterRepository gameCharacterRepository;

    @Value("${nexon.api.key}")
    private String apiKey;

    public CharacterService(GameCharacterRepository gameCharacterRepository) {
        this.gameCharacterRepository = gameCharacterRepository;
    }

    public CharacterResponse getCharacter(String name) {

        

        // 1. 先查資料庫
        Optional<GameCharacter> savedCharacter = gameCharacterRepository.findByCharacterName(name);


        if (savedCharacter.isPresent()) {
            System.out.println("有資料");   

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

        // 2. 資料庫沒有，再打 Nexon API
        
        System.out.println("沒資料");
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("x-nxopen-api-key", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        // STEP1 取得 OCID
        String idUrl = "https://open.api.nexon.com/maplestorytw/v1/id?character_name=" + name;

        ResponseEntity<Map> idResponse = restTemplate.exchange(
                idUrl,
                HttpMethod.GET,
                entity,
                Map.class);

        String ocid = (String) idResponse.getBody().get("ocid");
        System.out.println(ocid);

        // STEP2 查角色資料
        String basicUrl = "https://open.api.nexon.com/maplestorytw/v1/character/basic?ocid=" + ocid;

        ResponseEntity<CharacterResponse> response = restTemplate.exchange(
                basicUrl,
                HttpMethod.GET,
                entity,
                CharacterResponse.class);

        CharacterResponse characterResponse = response.getBody();

        if (characterResponse != null) {
            saveCharacter(characterResponse, ocid);
        }

        return response.getBody();
    }

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