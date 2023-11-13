package com.laba.solvd.airport;

import java.time.LocalDateTime;
import java.util.Date;

public class Flight {
    private String flightNumber;
    private String arrivalAirport;
    private String departureAirport;
    private LocalDateTime arrivalTime;
    private LocalDateTime departureTime;
    private double distanceInKilometres;

    public Flight(String flightNumber, String arrivalAirport, String departureAirport,
                  LocalDateTime arrivalTime, LocalDateTime departureTime, double distanceInKilometres) {
        this.flightNumber = flightNumber;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
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
}
