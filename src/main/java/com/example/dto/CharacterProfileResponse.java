package com.example.dto;

public class CharacterProfileResponse {

    private CharacterResponse basic;
    private ItemEquipmentResponse equipment;

    public CharacterResponse getBasic() {
        return basic;
    }

    public void setBasic(CharacterResponse basic) {
        this.basic = basic;
    }

    public ItemEquipmentResponse getEquipment() {
        return equipment;
    }

    public void setEquipment(ItemEquipmentResponse equipment) {
        this.equipment = equipment;
    }
}