package com.example.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "characters")
public class GameCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String ocid;

    @Column(nullable = false)
    private String characterName;

    private String worldName;

    private String characterGender;

    private String characterClass;

    private String characterClassLevel;

    private int characterLevel;

    private long characterExp;

    private String characterExpRate;

    private String characterGuildName;

    @Column(length = 1000)
    private String characterImage;

    private String characterDateCreate;

    private String accessFlag;

    private String liberationQuestClear;

    private LocalDateTime lastUpdated;

    public GameCharacter() {
    }

    public Long getId() {
        return id;
    }

    public String getOcid() {
        return ocid;
    }

    public void setOcid(String ocid) {
        this.ocid = ocid;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getWorldName() {
        return worldName;
    }

    public void setWorldName(String worldName) {
        this.worldName = worldName;
    }

    public String getCharacterGender() {
        return characterGender;
    }

    public void setCharacterGender(String characterGender) {
        this.characterGender = characterGender;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public String getCharacterClassLevel() {
        return characterClassLevel;
    }

    public void setCharacterClassLevel(String characterClassLevel) {
        this.characterClassLevel = characterClassLevel;
    }

    public int getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(int characterLevel) {
        this.characterLevel = characterLevel;
    }

    public long getCharacterExp() {
        return characterExp;
    }

    public void setCharacterExp(long characterExp) {
        this.characterExp = characterExp;
    }

    public String getCharacterExpRate() {
        return characterExpRate;
    }

    public void setCharacterExpRate(String characterExpRate) {
        this.characterExpRate = characterExpRate;
    }

    public String getCharacterGuildName() {
        return characterGuildName;
    }

    public void setCharacterGuildName(String characterGuildName) {
        this.characterGuildName = characterGuildName;
    }

    public String getCharacterImage() {
        return characterImage;
    }

    public void setCharacterImage(String characterImage) {
        this.characterImage = characterImage;
    }

    public String getCharacterDateCreate() {
        return characterDateCreate;
    }

    public void setCharacterDateCreate(String characterDateCreate) {
        this.characterDateCreate = characterDateCreate;
    }

    public String getAccessFlag() {
        return accessFlag;
    }

    public void setAccessFlag(String accessFlag) {
        this.accessFlag = accessFlag;
    }

    public String getLiberationQuestClear() {
        return liberationQuestClear;
    }

    public void setLiberationQuestClear(String liberationQuestClear) {
        this.liberationQuestClear = liberationQuestClear;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}