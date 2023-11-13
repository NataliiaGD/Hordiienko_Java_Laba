package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportType;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static com.laba.solvd.airport.Crew.calculateNumberOfCrewForFlight;
import static com.laba.solvd.airport.Ticket.checkTicketTypeAccordingToThePrice;

public class Main {
    public static void main(String[] args) {
        Person passenger = new Passenger("Bob", 25, "abc123");
        Flight flight = new Flight("abc12", "Australia", "Poland",
                LocalDateTime.of(2023, 12, 12, 12, 12),
                LocalDateTime.of(2023, 12, 12, 20, 20), 600);
        Airport warsawAirport = new Airport("Chopin", "123", "Poland",
                AirportType.DEPARTURE_AIRPORT);
        Airport sydneyAirport = new Airport("Sydney", "123", "Australia",
                AirportType.ARRIVAL_AIRPORT);
        System.out.println(calculateNumberOfCrewForFlight(flight));

        Ticket ticket = new Ticket(1300);
        double price = ticket.getPrice();
        System.out.println(checkTicketTypeAccordingToThePrice(price));
    }
}
