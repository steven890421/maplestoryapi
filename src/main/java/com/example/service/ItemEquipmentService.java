package com.example.service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.dto.ItemEquipmentResponse;

import java.net.URI;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

@Service
public class ItemEquipmentService {

    @Value("${nexon.api.key}")
    private String apiKey;

    public ItemEquipmentResponse getItemEquipment(String ocid) {

        System.out.println("呼叫 ItemEquipmentService.getItemEquipment，ocid: " + ocid);

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("x-nxopen-api-key", apiKey);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        

        URI uri = UriComponentsBuilder
                .fromHttpUrl("https://open.api.nexon.com/maplestorytw/v1/character/item-equipment")
                .queryParam("ocid", ocid)
                .build()
                .toUri();

        ResponseEntity<ItemEquipmentResponse> response = restTemplate.exchange(uri, HttpMethod.GET, entity, ItemEquipmentResponse.class);

        ItemEquipmentResponse itemEquipmentResponse = response.getBody();
        System.out.println("API 回傳的 ItemEquipmentResponse: " + itemEquipmentResponse);

        return itemEquipmentResponse;


    }
}