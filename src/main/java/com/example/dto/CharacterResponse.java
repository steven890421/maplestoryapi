package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CharacterResponse {

    @JsonProperty("character_name")
    private String characterName;

    @JsonProperty("world_name")
    private String worldName;

    @JsonProperty("character_gender")
    private String characterGender;

    @JsonProperty("character_class")
    private String characterClass;

    @JsonProperty("character_class_level")
    private String characterClassLevel;

    @JsonProperty("character_level")
    private int characterLevel;

    @JsonProperty("character_exp")
    private long characterExp;

    @JsonProperty("character_exp_rate")
    private String characterExpRate;

    @JsonProperty("character_guild_name")
    private String characterGuildName;

    @JsonProperty("character_image")
    private String characterImage;

    @JsonProperty("character_date_create")
    private String characterDateCreate;

    @JsonProperty("access_flag")
    private String accessFlag;

    @JsonProperty("liberation_quest_clear")
    private String liberationQuestClear;

    
    // ✅ getters（必要）
    public String getCharacterName() { return characterName; }
    public String getWorldName() { return worldName; }
    public String getCharacterGender() { return characterGender; }
    public String getCharacterClass() { return characterClass; }
    public String getCharacterClassLevel() { return characterClassLevel; }
    public int getCharacterLevel() { return characterLevel; }
    public long getCharacterExp() { return characterExp; }
    public String getCharacterExpRate() { return characterExpRate; }
    public String getCharacterGuildName() { return characterGuildName; }
    public String getCharacterImage() { return characterImage; }
    public String getCharacterDateCreate() { return characterDateCreate; }
    public String getAccessFlag() { return accessFlag; }
    public String getLiberationQuestClear() { return liberationQuestClear; }

    // setter
    public void setCharacterName(String characterName) { this.characterName = characterName; }
    public void setWorldName(String worldName) { this.worldName = worldName; }
    public void setCharacterGender(String characterGender) { this.characterGender = characterGender; }
    public void setCharacterClass(String characterClass) { this.characterClass = characterClass; }
    public void setCharacterClassLevel(String characterClassLevel) { this.characterClassLevel = characterClassLevel; }
    public void setCharacterLevel(int characterLevel) { this.characterLevel = characterLevel; }
    public void setCharacterExp(long characterExp) { this.characterExp = characterExp; }
    public void setCharacterExpRate(String characterExpRate) { this.characterExpRate = characterExpRate; }
    public void setCharacterGuildName(String characterGuildName) { this.characterGuildName = characterGuildName; }
    public void setCharacterImage(String characterImage) { this.characterImage = characterImage; }
    public void setCharacterDateCreate(String characterDateCreate) { this.characterDateCreate = characterDateCreate; }
    public void setAccessFlag(String accessFlag) { this.accessFlag = accessFlag; }
    public void setLiberationQuestClear(String liberationQuestClear) { this.liberationQuestClear = liberationQuestClear; }
}