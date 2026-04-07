package com.example.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemEquipment {

    @JsonProperty("item_equipment_part")
    private String itemEquipmentPart;

    @JsonProperty("item_equipment_slot")
    private String itemEquipmentSlot;

    @JsonProperty("item_name")
    private String itemName;

    @JsonProperty("item_icon")
    private String itemIcon;

    @JsonProperty("item_description")
    private String itemDescription;

    @JsonProperty("item_shape_name")
    private String itemShapeName;

    @JsonProperty("item_shape_icon")
    private String itemShapeIcon;

    @JsonProperty("item_gender")
    private String itemGender;

    @JsonProperty("item_total_option")
    private ItemOption itemTotalOption;

    @JsonProperty("item_base_option")
    private ItemOption itemBaseOption;

    @JsonProperty("potential_option_grade")
    private String potentialOptionGrade;

    @JsonProperty("additional_potential_option_grade")
    private String additionalPotentialOptionGrade;

    @JsonProperty("potential_option_flag")
    private String potentialOptionFlag;

    @JsonProperty("potential_option_1")
    private String potentialOption1;

    @JsonProperty("potential_option_2")
    private String potentialOption2;

    @JsonProperty("potential_option_3")
    private String potentialOption3;

    @JsonProperty("additional_potential_option_flag")
    private String additionalPotentialOptionFlag;

    @JsonProperty("additional_potential_option_1")
    private String additionalPotentialOption1;

    @JsonProperty("additional_potential_option_2")
    private String additionalPotentialOption2;

    @JsonProperty("additional_potential_option_3")
    private String additionalPotentialOption3;

    @JsonProperty("equipment_level_increase")
    private Integer equipmentLevelIncrease;

    @JsonProperty("item_exceptional_option")
    private ItemExceptionalOption itemExceptionalOption;

    @JsonProperty("item_add_option")
    private ItemAddOption itemAddOption;

    @JsonProperty("growth_exp")
    private Integer growthExp;

    @JsonProperty("growth_level")
    private Integer growthLevel;

    @JsonProperty("scroll_upgrade")
    private String scrollUpgrade;

    @JsonProperty("cuttable_count")
    private String cuttableCount;

    @JsonProperty("golden_hammer_flag")
    private String goldenHammerFlag;

    @JsonProperty("scroll_resilience_count")
    private String scrollResilienceCount;

    @JsonProperty("scroll_upgradeable_count")
    private String scrollUpgradeableCount;

    @JsonProperty("soul_name")
    private String soulName;

    @JsonProperty("soul_option")
    private String soulOption;

    @JsonProperty("item_etc_option")
    private ItemEtcOption itemEtcOption;

    @JsonProperty("starforce")
    private String starforce;

    @JsonProperty("starforce_scroll_flag")
    private String starforceScrollFlag;

    @JsonProperty("item_starforce_option")
    private ItemStarforceOption itemStarforceOption;

    @JsonProperty("special_ring_level")
    private Integer specialRingLevel;

    @JsonProperty("date_expire")
    private String dateExpire;

    @JsonProperty("freestyle_flag")
    private String freestyleFlag;

    // Getters and Setters
    public String getItemEquipmentPart() { return itemEquipmentPart; }
    public void setItemEquipmentPart(String itemEquipmentPart) { this.itemEquipmentPart = itemEquipmentPart; }

    public String getItemEquipmentSlot() { return itemEquipmentSlot; }
    public void setItemEquipmentSlot(String itemEquipmentSlot) { this.itemEquipmentSlot = itemEquipmentSlot; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public String getItemIcon() { return itemIcon; }
    public void setItemIcon(String itemIcon) { this.itemIcon = itemIcon; }

    public String getItemDescription() { return itemDescription; }
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription; }

    public String getItemShapeName() { return itemShapeName; }
    public void setItemShapeName(String itemShapeName) { this.itemShapeName = itemShapeName; }

    public String getItemShapeIcon() { return itemShapeIcon; }
    public void setItemShapeIcon(String itemShapeIcon) { this.itemShapeIcon = itemShapeIcon; }

    public String getItemGender() { return itemGender; }
    public void setItemGender(String itemGender) { this.itemGender = itemGender; }

    public ItemOption getItemTotalOption() { return itemTotalOption; }
    public void setItemTotalOption(ItemOption itemTotalOption) { this.itemTotalOption = itemTotalOption; }

    public ItemOption getItemBaseOption() { return itemBaseOption; }
    public void setItemBaseOption(ItemOption itemBaseOption) { this.itemBaseOption = itemBaseOption; }

    public String getPotentialOptionGrade() { return potentialOptionGrade; }
    public void setPotentialOptionGrade(String potentialOptionGrade) { this.potentialOptionGrade = potentialOptionGrade; }

    public String getAdditionalPotentialOptionGrade() { return additionalPotentialOptionGrade; }
    public void setAdditionalPotentialOptionGrade(String additionalPotentialOptionGrade) { this.additionalPotentialOptionGrade = additionalPotentialOptionGrade; }

    public String getPotentialOptionFlag() { return potentialOptionFlag; }
    public void setPotentialOptionFlag(String potentialOptionFlag) { this.potentialOptionFlag = potentialOptionFlag; }

    public String getPotentialOption1() { return potentialOption1; }
    public void setPotentialOption1(String potentialOption1) { this.potentialOption1 = potentialOption1; }

    public String getPotentialOption2() { return potentialOption2; }
    public void setPotentialOption2(String potentialOption2) { this.potentialOption2 = potentialOption2; }

    public String getPotentialOption3() { return potentialOption3; }
    public void setPotentialOption3(String potentialOption3) { this.potentialOption3 = potentialOption3; }

    public String getAdditionalPotentialOptionFlag() { return additionalPotentialOptionFlag; }
    public void setAdditionalPotentialOptionFlag(String additionalPotentialOptionFlag) { this.additionalPotentialOptionFlag = additionalPotentialOptionFlag; }

    public String getAdditionalPotentialOption1() { return additionalPotentialOption1; }
    public void setAdditionalPotentialOption1(String additionalPotentialOption1) { this.additionalPotentialOption1 = additionalPotentialOption1; }

    public String getAdditionalPotentialOption2() { return additionalPotentialOption2; }
    public void setAdditionalPotentialOption2(String additionalPotentialOption2) { this.additionalPotentialOption2 = additionalPotentialOption2; }

    public String getAdditionalPotentialOption3() { return additionalPotentialOption3; }
    public void setAdditionalPotentialOption3(String additionalPotentialOption3) { this.additionalPotentialOption3 = additionalPotentialOption3; }

    public Integer getEquipmentLevelIncrease() { return equipmentLevelIncrease; }
    public void setEquipmentLevelIncrease(Integer equipmentLevelIncrease) { this.equipmentLevelIncrease = equipmentLevelIncrease; }

    public ItemExceptionalOption getItemExceptionalOption() { return itemExceptionalOption; }
    public void setItemExceptionalOption(ItemExceptionalOption itemExceptionalOption) { this.itemExceptionalOption = itemExceptionalOption; }

    public ItemAddOption getItemAddOption() { return itemAddOption; }
    public void setItemAddOption(ItemAddOption itemAddOption) { this.itemAddOption = itemAddOption; }

    public Integer getGrowthExp() { return growthExp; }
    public void setGrowthExp(Integer growthExp) { this.growthExp = growthExp; }

    public Integer getGrowthLevel() { return growthLevel; }
    public void setGrowthLevel(Integer growthLevel) { this.growthLevel = growthLevel; }

    public String getScrollUpgrade() { return scrollUpgrade; }
    public void setScrollUpgrade(String scrollUpgrade) { this.scrollUpgrade = scrollUpgrade; }

    public String getCuttableCount() { return cuttableCount; }
    public void setCuttableCount(String cuttableCount) { this.cuttableCount = cuttableCount; }

    public String getGoldenHammerFlag() { return goldenHammerFlag; }
    public void setGoldenHammerFlag(String goldenHammerFlag) { this.goldenHammerFlag = goldenHammerFlag; }

    public String getScrollResilienceCount() { return scrollResilienceCount; }
    public void setScrollResilienceCount(String scrollResilienceCount) { this.scrollResilienceCount = scrollResilienceCount; }

    public String getScrollUpgradeableCount() { return scrollUpgradeableCount; }
    public void setScrollUpgradeableCount(String scrollUpgradeableCount) { this.scrollUpgradeableCount = scrollUpgradeableCount; }

    public String getSoulName() { return soulName; }
    public void setSoulName(String soulName) { this.soulName = soulName; }

    public String getSoulOption() { return soulOption; }
    public void setSoulOption(String soulOption) { this.soulOption = soulOption; }

    public ItemEtcOption getItemEtcOption() { return itemEtcOption; }
    public void setItemEtcOption(ItemEtcOption itemEtcOption) { this.itemEtcOption = itemEtcOption; }

    public String getStarforce() { return starforce; }
    public void setStarforce(String starforce) { this.starforce = starforce; }

    public String getStarforceScrollFlag() { return starforceScrollFlag; }
    public void setStarforceScrollFlag(String starforceScrollFlag) { this.starforceScrollFlag = starforceScrollFlag; }

    public ItemStarforceOption getItemStarforceOption() { return itemStarforceOption; }
    public void setItemStarforceOption(ItemStarforceOption itemStarforceOption) { this.itemStarforceOption = itemStarforceOption; }

    public Integer getSpecialRingLevel() { return specialRingLevel; }
    public void setSpecialRingLevel(Integer specialRingLevel) { this.specialRingLevel = specialRingLevel; }

    public String getDateExpire() { return dateExpire; }
    public void setDateExpire(String dateExpire) { this.dateExpire = dateExpire; }

    public String getFreestyleFlag() { return freestyleFlag; }
    public void setFreestyleFlag(String freestyleFlag) { this.freestyleFlag = freestyleFlag; }
}
