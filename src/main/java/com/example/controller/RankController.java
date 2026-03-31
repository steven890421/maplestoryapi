package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.RankService;

@RestController
@RequestMapping("/rank")
public class RankController {
    public final RankService rankService;
    public RankController(RankService rankService){
        this.rankService = rankService;
    }
    @GetMapping
    public void getRankData(){
        rankService.geRankData();
    }
}
