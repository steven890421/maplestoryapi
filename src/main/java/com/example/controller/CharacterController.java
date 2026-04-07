package com.example.controller;

import com.example.dto.ApiResponse;
import com.example.dto.CharacterProfileResponse;
import com.example.dto.CharacterResponse;
import com.example.service.CharacterProfileService;
import com.example.service.CharacterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/character")
public class CharacterController {

    
    private final CharacterService characterService;
    private final CharacterProfileService characterProfileService;
    public CharacterController(CharacterService characterService, CharacterProfileService characterProfileService) {
        this.characterService = characterService;
        this.characterProfileService = characterProfileService;
    }

    

    @GetMapping("/{name}")
    public ApiResponse<CharacterResponse> getCharacter(@PathVariable("name") String name) {
        CharacterResponse response = characterService.getCharacter(name);
        return ApiResponse.success(response, "查詢成功");
    }

     @GetMapping("/{name}/profile")
    public CharacterProfileResponse getProfile(@PathVariable String name) {
       CharacterProfileResponse profile = characterProfileService.getCharacterProfile(name);
       return profile;
    }
}

