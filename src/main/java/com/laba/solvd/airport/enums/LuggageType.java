package com.laba.solvd.airport.enums;

public enum LuggageType {
    CARRY_ON("Carry_on bag"),
    CHECKED_BAG("Checked_bag");

    private final String displayType;

    LuggageType(String displayType) {
        this.displayType = displayType;
    }

    public String getType() {
        return displayType;
    }
}
