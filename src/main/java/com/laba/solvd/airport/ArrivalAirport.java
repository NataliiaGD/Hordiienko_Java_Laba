package com.laba.solvd.airport;

public class ArrivalAirport extends Airport {

    public ArrivalAirport(String name, String airportCode, String location) {
        super(name, airportCode, location);
    }

    @Override
    public String toString() {
        return "ArrivalAirport{" +
                "name='" + name + '\'' +
                ", airportCode='" + airportCode + '\'' +
                ", location='" + location + '\'' +
                '}';
    }


    @Override
    public String getAirportStatus() {
        return "Airport is receiving flights";
    }
}
