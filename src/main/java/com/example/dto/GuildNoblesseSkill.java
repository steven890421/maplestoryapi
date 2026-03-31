package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GuildNoblesseSkill {

    @JsonProperty("skill_name")
    private String skillName;

    @JsonProperty("skill_description")
    private String skillDescription;

    @JsonProperty("skill_level")
    private int skillLevel;

    @JsonProperty("skill_effect")
    private String skillEffect;

    @JsonProperty("skill_icon")
    private String skillIcon;

    // getters
    public String getSkillName() { return skillName; }
    public String getSkillDescription() { return skillDescription; }
    public int getSkillLevel() { return skillLevel; }
    public String getSkillEffect() { return skillEffect; }
    public String getSkillIcon() { return skillIcon; }
}