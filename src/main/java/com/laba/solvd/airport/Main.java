package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportType;
import com.laba.solvd.airport.exceptions.InvalidPriceException;
import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;
import com.laba.solvd.airport.interfaces.Workable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.Arrays;

import static com.laba.solvd.airport.Crew.*;
import static com.laba.solvd.airport.TicketRequest.checkTicketTypeAccordingToThePrice;
import static com.laba.solvd.airport.enums.TerminalType.INTERNATIONAL;
import static com.laba.solvd.airport.enums.TicketType.ECONOMY_CLASS;

public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidPriceException, InvalidTerminalTypeException {
        Passenger passenger = new Passenger("Bob", 25, "abc123");
        Airport warsawAirport = new Airport("Chopin", "123", "Poland",
                AirportType.DEPARTURE_AIRPORT);
        Airport sydneyAirport = new Airport("Sydney", "123", "Australia",
                AirportType.ARRIVAL_AIRPORT);
        Flight flight = new Flight("abc12", warsawAirport.getLocation(), sydneyAirport.getLocation(),
                LocalDateTime.of(2023, 12, 12, 12, 12),
                LocalDateTime.of(2023, 12, 12, 20, 20), -5001);
        Gate gate = new Gate("2");

        LOGGER.info(calculateNumberOfCrewForFlight(flight));

        Luggage luggage = new Luggage("CarryOn", 5, passenger.getName());
        TicketRequest ticketRequest = new TicketRequest(ECONOMY_CLASS, luggage, flight);
        LOGGER.info(ticketRequest.calculateTotalPrice());

        Employee employee = new Employee("Jack", 30, "1ed",
                "Pilot", 10);
        Employee employee2 = new Employee("John", 28, "2ed",
                "Cabin_Crew", 10);


        Terminal terminal = new Terminal("A", INTERNATIONAL);
        terminal.performTerminalOperation();
        LOGGER.info(employee.calculateYearsToRetirement());

        Aircraft aircraft = new Aircraft(44, "Boeing");
        aircraft.fly();
        employee.work();
        LOGGER.info(Arrays.toString(getEmployees()));

        Workable employee3 = new Employee("Jack", 30, "1ed",
                "Pilot", 10);
        employee3.work();

        Person employee4 = new Employee("Jack", 30, "1ed",
                "Pilot", 10);
        employee4.displayPersonInfo();

        LOGGER.info(checkTicketTypeAccordingToThePrice(1000));
        saveCrewToFile();


    }
}
