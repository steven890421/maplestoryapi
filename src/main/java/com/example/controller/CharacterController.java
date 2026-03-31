package com.example.controller;

import org.springframework.web.bind.annotation.*;
import com.example.service.CharacterService;
import com.example.dto.CharacterResponse;


@RestController
@RequestMapping("/character")
public class CharacterController {              

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{name}")
    public CharacterResponse getCharacter(@PathVariable("name") String name) {
        return characterService.getCharacter(name);
    }
} 

// 當請求 /character/{name} 時
// Spring 會呼叫 CharacterController.getCharacter()
// 這個方法會使用已經注入的 CharacterService
// 取得角色資料並回傳 CharacterResponse
// Spring 再把它轉成 JSON 回應給 client。