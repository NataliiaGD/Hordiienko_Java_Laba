package com.laba.solvd.airport;

import com.laba.solvd.airport.exceptions.InvalidPriceException;
import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.laba.solvd.airport.BoardingPass.generateBoardingPass;
import static com.laba.solvd.airport.Crew.calculateNumberOfCrewForFlight;
import static com.laba.solvd.airport.enums.AirportType.*;
import static com.laba.solvd.airport.enums.TerminalType.INTERNATIONAL;
import static com.laba.solvd.airport.enums.TicketType.ECONOMY_CLASS;

public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidTerminalTypeException {

        List<Aircraft> listOfAircraft = new ArrayList<>();
        listOfAircraft.add(new Aircraft(1, "Boeing777"));
        listOfAircraft.add(new Aircraft(2, "AirBus320"));
        Aircraft aircraft1 = listOfAircraft.get(0);
        aircraft1.fly();

        CustomLinkedList<Employee> listOfEmployees = new CustomLinkedList<>();
        listOfEmployees.add(new Employee("Bob", 35, "1abc", "Pilot", 5));
        listOfEmployees.add(new Employee("Robert", 37, "2abc", "Pilot", 8));
        listOfEmployees.add(new Employee("Kate", 30, "3abc", "CabinCrew", 5));
        Employee employee1 = listOfEmployees.get(0);
        Employee employee2 = listOfEmployees.get(2);
        employee1.work();
        LOGGER.info(employee1.calculateYearsToRetirement());
        employee2.displayPersonInfo();


        Airline airline = new Airline("LOTAirline", 3, listOfAircraft, listOfEmployees);

        List<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("1CD", "ChopinAirport", "DohaAirport",
                LocalDateTime.now().minusHours(15), LocalDateTime.now().minusHours(10), 5000));
        listOfFlights.add(new Flight("1CDF", "DohaAirport", "SydneyAirport",
                LocalDateTime.now().minusHours(10), LocalDateTime.now(), 5000));
        Flight flight1 = listOfFlights.get(0);
        LOGGER.info(calculateNumberOfCrewForFlight(flight1));

        List<Gate> listOfGates = new ArrayList<>();
        listOfGates.add(new Gate("10A"));
        listOfGates.add(new Gate("10B"));
        listOfGates.add(new Gate("10C"));
        Gate gate = listOfGates.get(0);

        Terminal terminal1 = new Terminal("TerminalB", INTERNATIONAL, listOfGates);
        Terminal terminal2 = new Terminal("TerminalD", INTERNATIONAL, listOfGates);
        Set<Terminal> setOfTerminals = new HashSet<>();
        setOfTerminals.add(terminal1);
        setOfTerminals.add(terminal2);

        terminal1.performTerminalOperation();

        Airport airport = new Airport("ChopinAirport", "WAW", "Warsaw",
                DEPARTURE_AIRPORT, listOfFlights, setOfTerminals);
        Airport airport2 = new Airport("DohaAirport", "DOH", "Doha",
                TRANSIT, listOfFlights, setOfTerminals);
        Airport airport3 = new Airport("SydneyAirport", "SYD", "Sydney",
                ARRIVAL_AIRPORT, listOfFlights, setOfTerminals);

        Passenger passenger = new Passenger("Bob", 25, "abc123");
        Luggage luggage = new Luggage("CarryOn", 5, passenger.getName());
        TicketRequest ticketRequest = new TicketRequest(ECONOMY_CLASS, luggage, flight1);
        LOGGER.info(ticketRequest.calculateTotalPrice());

        flight1.addLuggage(luggage);

        LOGGER.info(generateBoardingPass(passenger, flight1, gate));


    }
}
