package com.laba.solvd.airport;

public class DepartureAirport extends Airport {

    public DepartureAirport(String name, String airportCode, String location) {
        super(name, airportCode, location);
    }

    @Override
    public String toString() {
        return "DepartureAirport{" +
                "name='" + name + '\'' +
                ", airportCode='" + airportCode + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public String getAirportStatus() {
        return "Airport is scheduling departures";
    }

}
