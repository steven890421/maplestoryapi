package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.exception.CustomException;
import com.example.exception.ErrorCode;

@Service
public class OcidService {

    @Value("${nexon.api.key}")
    private String apiKey;

    public String getOcidByName(String name) {

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-nxopen-api-key", apiKey);
        HttpEntity<String> entity = new HttpEntity<>(headers);
        String idUrl = "https://open.api.nexon.com/maplestorytw/v1/id?character_name=" + name;

        ResponseEntity<Map> ocidResponse = restTemplate.exchange(
                idUrl,
                HttpMethod.GET,
                entity,
                Map.class);

        Map body = ocidResponse.getBody();
        System.out.println("API 回傳資料：" + body);
        if (body == null || body.get("ocid") == null) {
            throw new CustomException(ErrorCode.CHARACTER_NOT_FOUND);
        }

        String ocid = (String) body.get("ocid");

        System.out.println("取得的 OCID：" + ocid);

        return ocid;
    }
}
