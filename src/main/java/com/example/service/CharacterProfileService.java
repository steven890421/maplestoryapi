package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.CharacterProfileResponse;
import com.example.dto.CharacterResponse;
import com.example.dto.ItemEquipmentResponse;

@Service
public class CharacterProfileService  {

    private final CharacterService characterService;
    private final ItemEquipmentService itemEquipmentService;
    private final OcidService ocidService;

    public CharacterProfileService(CharacterService characterService,ItemEquipmentService itemEquipmentService, OcidService ocidService) {
        this.characterService = characterService;
        this.itemEquipmentService = itemEquipmentService;
        this.ocidService = ocidService;
    }

    public CharacterProfileResponse getCharacterProfile(String name) {

        System.out.println("呼叫 CharacterProfileService.getCharacterProfile，角色名稱: " + name);
        String ocid = ocidService.getOcidByName(name);

        CharacterResponse basic = characterService.getCharacter(ocid);
        System.out.println("從 CharacterService 取得角色基本資料: " + basic);
        
        ItemEquipmentResponse equipment = itemEquipmentService.getItemEquipment(ocid);
        System.out.println("從 ItemEquipmentService 取得角色裝備資料: " + equipment);

        CharacterProfileResponse profile = new CharacterProfileResponse();
        profile.setBasic(basic);
        profile.setEquipment(equipment);
        System.out.println("組合角色資料與裝備資料完成，準備回傳 CharacterProfileResponse: " + profile);

        return profile;
    }
}