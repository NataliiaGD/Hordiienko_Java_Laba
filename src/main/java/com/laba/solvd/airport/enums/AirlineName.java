package com.laba.solvd.airport.enums;

public enum AirlineName {
    LOT("Lot polish airlines", "Star alliance"),
    LUFTHANSA("Lufthansa", "Star alliance"),
    QATAR_AIRWAYS("Qatar airways", "One world alliance");

    private final String fullName;
    private final String alliance;

    AirlineName(String fullName, String alliance) {
        this.fullName = fullName;
        this.alliance = alliance;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAlliance() {
        return alliance;
    }
}
