package com.laba.solvd.airport.enums;

public enum TerminalType {

    DOMESTIC,
    INTERNATIONAL;

    private String description;

    static {
        DOMESTIC.description = "Domestic terminal";
        INTERNATIONAL.description = "International terminal";
    }

    public String getDescription() {
        return description;
    }

}
