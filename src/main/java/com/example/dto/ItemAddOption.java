package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemAddOption {

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

    @JsonProperty("armor")
    private String armor;

    @JsonProperty("speed")
    private String speed;

    @JsonProperty("jump")
    private String jump;

    @JsonProperty("boss_damage")
    private String bossDamage;

    @JsonProperty("damage")
    private String damage;

    @JsonProperty("all_stat")
    private String allStat;

    @JsonProperty("equipment_level_decrease")
    private Integer equipmentLevelDecrease;

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

    public String getArmor() { return armor; }
    public void setArmor(String armor) { this.armor = armor; }

    public String getSpeed() { return speed; }
    public void setSpeed(String speed) { this.speed = speed; }

    public String getJump() { return jump; }
    public void setJump(String jump) { this.jump = jump; }

    public String getBossDamage() { return bossDamage; }
    public void setBossDamage(String bossDamage) { this.bossDamage = bossDamage; }

    public String getDamage() { return damage; }
    public void setDamage(String damage) { this.damage = damage; }

    public String getAllStat() { return allStat; }
    public void setAllStat(String allStat) { this.allStat = allStat; }

    public Integer getEquipmentLevelDecrease() { return equipmentLevelDecrease; }
    public void setEquipmentLevelDecrease(Integer equipmentLevelDecrease) { this.equipmentLevelDecrease = equipmentLevelDecrease; }
}
