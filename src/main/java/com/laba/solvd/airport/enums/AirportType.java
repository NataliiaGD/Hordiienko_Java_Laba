package com.laba.solvd.airport.enums;

public enum AirportType {
    ARRIVAL_AIRPORT("Arrival airport"),
    TRANSIT("Transit airport"),
    DEPARTURE_AIRPORT("Departure airport");

    private final String description;

    AirportType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
