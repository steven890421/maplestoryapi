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

        
        String ocid = ocidService.getOcidByName(name);

        CharacterResponse basic = characterService.getCharacter(ocid);
        
        
        ItemEquipmentResponse equipment = itemEquipmentService.getItemEquipment(ocid);
        

        CharacterProfileResponse profile = new CharacterProfileResponse();
        profile.setBasic(basic);
        profile.setEquipment(equipment);
       

        return profile;
    }
}