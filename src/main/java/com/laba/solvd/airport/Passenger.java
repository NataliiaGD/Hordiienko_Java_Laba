package com.laba.solvd.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Passenger extends Person {
    private static final Logger LOGGER = LogManager.getLogger(Passenger.class);
    private String flightNumber;

    public Passenger(String name, int age, String flightNumber) {
        super(name, age);
        this.flightNumber = flightNumber;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "flightNumber='" + flightNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return Objects.equals(flightNumber, passenger.flightNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightNumber);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Override
    public void displayPersonInfo() {
        LOGGER.info("Passenger name " + getName());
        LOGGER.info("Passenger flight number " + getFlightNumber());
    }
}
