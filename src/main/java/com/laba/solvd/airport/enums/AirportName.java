package com.laba.solvd.airport.enums;

public enum AirportName {
    WARSAW_CHOPIN("Warsaw Chopin airport", "Poland"),
    DOHA_HAMMAD("Doha Hammad airport", "Qatar"),
    SYDNEY("Sydney Kingsford Smith airport", "Australia");

    private final String fullName;
    private final String country;

    AirportName(String fullName, String country) {
        this.fullName = fullName;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCountry() {
        return country;
    }
}
