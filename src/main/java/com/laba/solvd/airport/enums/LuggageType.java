package com.laba.solvd.airport.enums;

public enum LuggageType {
    CARRY_ON,
    CHECKED_BAG;

    private String displayType;

    static {
        CARRY_ON.displayType = "Carry_on bag";
        CHECKED_BAG.displayType = "Checked_bag";
    }

    public String getType() {
        return displayType;
    }
}
