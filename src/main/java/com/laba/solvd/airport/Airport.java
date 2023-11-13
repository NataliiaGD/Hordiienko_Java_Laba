package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportType;

public class Airport {
    private String name;
    private String airportCode;
    private String location;
    private AirportType airportType;

    public Airport(String name, String airportCode, String location, AirportType airportType) {
        this.name = name;
        this.airportCode = airportCode;
        this.location = location;
        this.airportType = airportType;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", airportCode='" + airportCode + '\'' +
                ", location='" + location + '\'' +
                ", airportType=" + airportType +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public AirportType getAirportType() {
        return airportType;
    }

    public void setAirportType(AirportType airportType) {
        this.airportType = airportType;
    }
}
