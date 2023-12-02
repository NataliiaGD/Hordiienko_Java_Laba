package com.laba.solvd.airport.enums;

public enum TerminalType {
    DOMESTIC("Domestic terminal"),
    INTERNATIONAL("International terminal");

    private final String description;

    TerminalType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
