package com.laba.solvd.airport;

public abstract class Airport {
    protected String name;
    protected String airportCode;
    protected String location;

    public Airport(String name, String airportCode, String location) {
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

    protected abstract String getAirportStatus();
}
