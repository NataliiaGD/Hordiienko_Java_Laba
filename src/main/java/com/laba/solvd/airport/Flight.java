package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportName;
import com.laba.solvd.airport.interfaces.LuggageHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

public class Flight implements LuggageHandler {
    private static final Logger LOGGER = LogManager.getLogger(Flight.class);
    private String flightNumber;
    private AirportName departureAirport;
    private AirportName arrivalAirport;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private double distanceInKilometres;


    public Flight(String flightNumber, AirportName departureAirport, AirportName arrivalAirport,
                  LocalDateTime departureTime, LocalDateTime arrivalTime, double distanceInKilometres) {
        this.flightNumber = flightNumber;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.distanceInKilometres = distanceInKilometres;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", departureAirport=" + departureAirport +
                ", arrivalAirport=" + arrivalAirport +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", distanceInKilometres=" + distanceInKilometres +
                '}';
    }

    public AirportName getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(AirportName departureAirport) {
        this.departureAirport = departureAirport;
    }

    public AirportName getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(AirportName arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
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
        LOGGER.info("Luggage added to the flight: " + luggage);
    }
}
