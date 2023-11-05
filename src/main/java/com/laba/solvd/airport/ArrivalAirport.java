package com.laba.solvd.airport;

public class ArrivalAirport {
    private String name;
    private String airportCode;
    private String location;

    public ArrivalAirport(String name, String airportCode, String location) {
        this.name = name;
        this.airportCode = airportCode;
        this.location = location;
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
}
