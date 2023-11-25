package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportType;

import java.util.List;
import java.util.Set;

public class Airport {
    private String name;
    private String airportCode;
    private String location;
    private AirportType airportType;
    private List<Flight> listOfFlights;
    private Set<Terminal> setOfTerminals;

    public Airport(String name, String airportCode, String location, AirportType airportType,
                   List<Flight> listOfFlights, Set<Terminal> setOfTerminals) {
        this.name = name;
        this.airportCode = airportCode;
        this.location = location;
        this.airportType = airportType;
        this.listOfFlights = listOfFlights;
        this.setOfTerminals = setOfTerminals;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "name='" + name + '\'' +
                ", airportCode='" + airportCode + '\'' +
                ", location='" + location + '\'' +
                ", airportType=" + airportType +
                ", listOfFlights=" + listOfFlights +
                ", setOfTerminals=" + setOfTerminals +
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

    public List<Flight> getListOfFlights() {
        return listOfFlights;
    }

    public void setListOfFlights(List<Flight> listOfFlights) {
        this.listOfFlights = listOfFlights;
    }

    public Set<Terminal> getSetOfTerminals() {
        return setOfTerminals;
    }

    public void setSetOfTerminals(Set<Terminal> setOfTerminals) {
        this.setOfTerminals = setOfTerminals;
    }
}
