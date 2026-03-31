package com.example.service;

import java.net.URI;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.dto.GuildResponse;


@Service
public class GuildService {

    @Value("${nexon.api.key}")
    private String apiKey;

    public GuildResponse getGuild(String guildName, String worldName) {

        
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("x-nxopen-api-key", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        System.out.println(entity);

        URI idUri = UriComponentsBuilder
                .fromHttpUrl("https://open.api.nexon.com/maplestorytw/v1/guild/id")
                .queryParam("guild_name", guildName)
                .queryParam("world_name", worldName)
                .build()
                .toUri();

        System.out.println(idUri);

        ResponseEntity<Map> guildIdResponse = restTemplate.exchange(idUri, HttpMethod.GET, entity, Map.class);

        Map<String, Object> body = guildIdResponse.getBody();
        
        String guildId = (String) body.get("oguild_id");

        URI basicUri = UriComponentsBuilder
                .fromHttpUrl("https://open.api.nexon.com/maplestorytw/v1/guild/basic")
                .queryParam("oguild_id", guildId)
                .build()
                .toUri();
        
        ResponseEntity<GuildResponse> basicResponse = restTemplate.exchange(basicUri, HttpMethod.GET, entity, GuildResponse.class);
   
        
        // List<GuildSkill> skills = basicResponse.getBody().getGuildSkill();
        // for (GuildSkill skill : skills ){
        //     System.out.println(skill.getSkillName());
        // }


        return basicResponse.getBody();
    }
}
