package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemExceptionalOption {

    @JsonProperty("str")
    private String str;

    @JsonProperty("dex")
    private String dex;

    @JsonProperty("int")
    private String intValue;

    @JsonProperty("luk")
    private String luk;

    @JsonProperty("max_hp")
    private String maxHp;

    @JsonProperty("max_mp")
    private String maxMp;

    @JsonProperty("attack_power")
    private String attackPower;

    @JsonProperty("magic_power")
    private String magicPower;

    @JsonProperty("exceptional_upgrade")
    private Integer exceptionalUpgrade;

    // Getters and Setters
    public String getStr() { return str; }
    public void setStr(String str) { this.str = str; }

    public String getDex() { return dex; }
    public void setDex(String dex) { this.dex = dex; }

    public String getIntValue() { return intValue; }
    public void setIntValue(String intValue) { this.intValue = intValue; }

    public String getLuk() { return luk; }
    public void setLuk(String luk) { this.luk = luk; }

    public String getMaxHp() { return maxHp; }
    public void setMaxHp(String maxHp) { this.maxHp = maxHp; }

    public String getMaxMp() { return maxMp; }
    public void setMaxMp(String maxMp) { this.maxMp = maxMp; }

    public String getAttackPower() { return attackPower; }
    public void setAttackPower(String attackPower) { this.attackPower = attackPower; }

    public String getMagicPower() { return magicPower; }
    public void setMagicPower(String magicPower) { this.magicPower = magicPower; }

    public Integer getExceptionalUpgrade() { return exceptionalUpgrade; }
    public void setExceptionalUpgrade(Integer exceptionalUpgrade) { this.exceptionalUpgrade = exceptionalUpgrade; }
}
