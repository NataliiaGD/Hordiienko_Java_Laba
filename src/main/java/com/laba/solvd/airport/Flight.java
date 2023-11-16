package com.laba.solvd.airport;

import com.laba.solvd.airport.interfaces.LuggageHandler;

import java.time.LocalDateTime;

public class Flight implements LuggageHandler {
    private String flightNumber;
    private String arrivalAirport;
    private String departureAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double distanceInKilometres;

    public Flight(String flightNumber, String departureAirport, String arrivalAirport,
                  LocalDateTime arrivalTime, LocalDateTime departureTime, double distanceInKilometres) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.distanceInKilometres = distanceInKilometres;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public double getDistanceInKilometres() {
        return distanceInKilometres;
    }

    public void setDistanceInKilometres(double distanceInKilometres) {
        this.distanceInKilometres = distanceInKilometres;
    }

    @Override
    public void addLuggage(Luggage luggage) {
        System.out.println("Luggage added to the flight: " + luggage);
    }
}
