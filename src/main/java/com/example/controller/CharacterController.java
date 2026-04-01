package com.example.controller;

import com.example.dto.ApiResponse;
import com.example.dto.CharacterResponse;
import com.example.service.CharacterService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{name}")
    public ApiResponse<CharacterResponse> getCharacter(@PathVariable("name") String name) {
        CharacterResponse response = characterService.getCharacter(name);
        return ApiResponse.success(response, "查詢成功");
    }
}

