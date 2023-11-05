package com.laba.solvd.airport;

public class Airline {
    private String airlineName;
    private String crew;

    public Airline(String airlineName, String crew) {
        this.airlineName = airlineName;
        this.crew = crew;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }
}
