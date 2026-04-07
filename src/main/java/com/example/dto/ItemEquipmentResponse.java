package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ItemEquipmentResponse {

    @JsonProperty("date")
    private String date;

    @JsonProperty("character_gender")
    private String characterGender;

    @JsonProperty("character_class")
    private String characterClass;

    @JsonProperty("preset_no")
    private Integer presetNo;

    @JsonProperty("item_equipment")
    private List<ItemEquipment> itemEquipment;

    // Getters and Setters
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getCharacterGender() { return characterGender; }
    public void setCharacterGender(String characterGender) { this.characterGender = characterGender; }

    public String getCharacterClass() { return characterClass; }
    public void setCharacterClass(String characterClass) { this.characterClass = characterClass; }

    public Integer getPresetNo() { return presetNo; }
    public void setPresetNo(Integer presetNo) { this.presetNo = presetNo; }

    public List<ItemEquipment> getItemEquipment() { return itemEquipment; }
    public void setItemEquipment(List<ItemEquipment> itemEquipment) { this.itemEquipment = itemEquipment; }
}
