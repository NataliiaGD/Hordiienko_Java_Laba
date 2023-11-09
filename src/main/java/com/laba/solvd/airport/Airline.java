package com.laba.solvd.airport;

import java.util.Objects;

public class Airline {
    private String airlineName;
    private int crew;

    public Airline(String airlineName, int crew) {
        this.airlineName = airlineName;
        this.crew = crew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return crew == airline.crew && Objects.equals(airlineName, airline.airlineName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName, crew);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }
}
