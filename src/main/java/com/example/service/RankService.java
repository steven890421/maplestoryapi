package com.example.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.RankData;
import com.example.dto.RankResponse;

@Service
public class RankService {

    private final CharacterService characterService;

    public RankService(CharacterService characterService) {
        this.characterService = characterService;
    }

    public void geRankData() {

        RestTemplate restTemplate = new RestTemplate();

        String url = "https://tw-event.beanfun.com/MapleStory/api/UnionWebRank/FindRank";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("User-Agent", "Mozilla/5.0");
        headers.set("Referer", "https://tw-event.beanfun.com/MapleStory/UnionWebRank/Index.aspx");

        String requestBody = """
                {
                  "RankType": 1,
                  "GameWorldId": -1,
                  "Page": 1
                }
                """;

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<RankResponse> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                entity,
                RankResponse.class);

        RankResponse result = response.getBody();

        for (RankData rankData : result.getData().getRankDatas()) {
            characterService.getCharacter(rankData.getCharacterName());
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }

        System.out.println(result.getData().getRankDatas().get(0).getCharacterName());
        System.out.println(result.getData().getRankDatas().get(0).getCharacterLookUrl());
        System.out.println(result.getData().getRankDatas().get(0).getGuild());
        System.out.println(result.getData().getRankDatas().get(0).getUnionDps());

    }

}