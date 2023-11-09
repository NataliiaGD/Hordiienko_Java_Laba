package com.laba.solvd.airport;

public class Main {
    public static void main(String[] args) {
        Person passenger = new Passenger("Bob", 25, "abc123");
        Airport departureAirport = new DepartureAirport("PolishAirport", "abc1", "Warsaw");
        Airport arrivalAirport = new ArrivalAirport("SidneyAirport", "abc2", "Sidney");
    }
}
