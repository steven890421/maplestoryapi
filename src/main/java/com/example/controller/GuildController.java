package com.example.controller;

import com.example.dto.GuildResponse;
import com.example.service.GuildService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/guild")
public class GuildController {

    private final GuildService guildService;

    public GuildController(GuildService guildService){
        this.guildService = guildService;
    }

    @GetMapping
    public GuildResponse getGuild(
            @RequestParam String guildName,
            @RequestParam String worldName) {

        return guildService.getGuild(guildName, worldName);
    }
}