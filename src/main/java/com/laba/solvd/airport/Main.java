package com.laba.solvd.airport;

import com.laba.solvd.airport.exceptions.InvalidPriceException;
import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;

import static com.laba.solvd.airport.enums.AirportType.*;
import static com.laba.solvd.airport.enums.TerminalType.INTERNATIONAL;

public class Main {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) throws InvalidPriceException, InvalidTerminalTypeException {
        List<Aircraft> listOfAircraft = new ArrayList<>();
        listOfAircraft.add(new Aircraft(1, "Boeing777"));
        listOfAircraft.add(new Aircraft(2, "AirBus320"));

        List<Employee> listOfEmployees = new LinkedList<>();
        listOfEmployees.add(new Employee("Bob", 35, "1abc", "Pilot", 5));
        listOfEmployees.add(new Employee("Robert", 37, "2abc", "Pilot", 8));
        listOfEmployees.add(new Employee("Kate", 30, "3abc", "CabinCrew", 5));

        Airline airline = new Airline("LOTAirline", 3, listOfAircraft, listOfEmployees);

        List<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("1CD", "ChopinAirport", "DohaAirport",
                LocalDateTime.now().minusHours(15), LocalDateTime.now().minusHours(10), 5000));
        listOfFlights.add(new Flight("1CDF", "DohaAirport", "SydneyAirport",
                LocalDateTime.now().minusHours(10), LocalDateTime.now(), 5000));

        List<Gate> listOfGates = new ArrayList<>();
        listOfGates.add(new Gate("10A"));
        listOfGates.add(new Gate("10B"));
        listOfGates.add(new Gate("10C"));

        Set<Terminal> setOfTerminals = new HashSet<>();
        setOfTerminals.add(new Terminal("TerminalB", INTERNATIONAL, listOfGates));
        setOfTerminals.add(new Terminal("TerminalD", INTERNATIONAL, listOfGates));

        Airport airport = new Airport("ChopinAirport", "WAW", "Warsaw",
                DEPARTURE_AIRPORT, listOfFlights, setOfTerminals);
        Airport airport2 = new Airport("DohaAirport", "DOH", "Doha",
                TRANSIT, listOfFlights, setOfTerminals);
        Airport airport3 = new Airport("SydneyAirport", "SYD", "Sydney",
                ARRIVAL_AIRPORT, listOfFlights, setOfTerminals);
    }
}
