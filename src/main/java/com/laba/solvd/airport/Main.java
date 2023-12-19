package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirportName;
import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;
import com.laba.solvd.airport.interfaces.FlightInformationPrinter;
import com.laba.solvd.airport.interfaces.PassengerFilter;
import com.laba.solvd.airport.interfaces.PassengerMapper;
import com.laba.solvd.airport.interfaces.PassengerPrinter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.*;

import static com.laba.solvd.airport.BoardingPass.generateBoardingPass;
import static com.laba.solvd.airport.Crew.calculateNumberOfCrewForFlight;
import static com.laba.solvd.airport.Flight.printFlightInformation;
import static com.laba.solvd.airport.Gate.*;
import static com.laba.solvd.airport.Passenger.*;
import static com.laba.solvd.airport.enums.AirlineName.LOT;
import static com.laba.solvd.airport.enums.AirportName.*;
import static com.laba.solvd.airport.enums.AirportType.*;
import static com.laba.solvd.airport.enums.LuggageType.CARRY_ON;
import static com.laba.solvd.airport.enums.TerminalType.INTERNATIONAL;
import static com.laba.solvd.airport.enums.TicketType.ECONOMY_CLASS;
import static java.time.temporal.ChronoUnit.HOURS;

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


        Airline airline = new Airline(LOT, 3, listOfAircraft, listOfEmployees);

        List<Flight> listOfFlights = new ArrayList<>();
        listOfFlights.add(new Flight("1CD", WARSAW_CHOPIN, DOHA_HAMMAD,
                LocalDateTime.now().minusHours(15), LocalDateTime.now().minusHours(10), 5000));
        listOfFlights.add(new Flight("1CDF", DOHA_HAMMAD, SYDNEY,
                LocalDateTime.now().minusHours(10), LocalDateTime.now(), 5000));
        Flight flight1 = listOfFlights.get(0);
        LOGGER.info(calculateNumberOfCrewForFlight(flight1));

        List<Gate> listOfGates = new ArrayList<>();
        listOfGates.add(new Gate("1A"));
        listOfGates.add(new Gate("1B"));
        listOfGates.add(new Gate("2A"));
        listOfGates.add(new Gate("2B"));
        listOfGates.add(new Gate("2B"));
        Gate gate = listOfGates.get(0);

        Terminal terminal1 = new Terminal("TerminalB", INTERNATIONAL, listOfGates);
        Terminal terminal2 = new Terminal("TerminalD", INTERNATIONAL, listOfGates);
        Set<Terminal> setOfTerminals = new HashSet<>();
        setOfTerminals.add(terminal1);
        setOfTerminals.add(terminal2);

        terminal1.performTerminalOperation();

        Airport airport = new Airport(WARSAW_CHOPIN, "WAW", "Warsaw",
                DEPARTURE_AIRPORT, listOfFlights, setOfTerminals);
        Airport airport2 = new Airport(DOHA_HAMMAD, "DOH", "Doha",
                TRANSIT, listOfFlights, setOfTerminals);
        Airport airport3 = new Airport(SYDNEY, "SYD", "Sydney",
                ARRIVAL_AIRPORT, listOfFlights, setOfTerminals);

        Passenger passenger = new Passenger("Bob", 25, "abc123");
        Luggage luggage = new Luggage(CARRY_ON, 5, passenger.getName());
        TicketRequest ticketRequest = new TicketRequest(ECONOMY_CLASS, luggage, flight1);
        LOGGER.info(ticketRequest.calculateTotalPrice());

        flight1.addLuggage(luggage);

        LOGGER.info(generateBoardingPass(passenger, flight1, gate));

        Predicate<Flight> isDepartingFromWarsaw = flight -> flight.getDepartureAirport().equals(WARSAW_CHOPIN);
        listOfFlights.stream()
                .filter(isDepartingFromWarsaw)
                .forEach(System.out::println);

        Consumer<Flight> printFlightInfo = flight -> System.out.println("Flight " + flight.getFlightNumber() + " from "
                + flight.getDepartureAirport() + " to " + flight.getArrivalAirport());
        listOfFlights.forEach(printFlightInfo);

        Function<Flight, Long> calculateFlightDuration = flight -> flight.getDepartureTime().until(flight.getArrivalTime(), HOURS);
        listOfFlights.stream().map(calculateFlightDuration).forEach(System.out::println);

        Supplier<Flight> createNewFlight = () -> new Flight("45", WARSAW_CHOPIN, DOHA_HAMMAD,
                LocalDateTime.now().minusHours(15), LocalDateTime.now().minusHours(10), 5000);
        Flight newFlight = createNewFlight.get();
        LOGGER.info(newFlight);

        BinaryOperator<Double> sumAllFlightsDistance = Double::sum;
        Optional<Double> totalDistanceOfAllFlights = listOfFlights.stream()
                .map(flight -> flight.getDistanceInKilometres())
                .reduce(sumAllFlightsDistance);
        LOGGER.info(totalDistanceOfAllFlights);

        PassengerFilter<Passenger> filterByAge = pass -> pass.getAge() > 18;
        List<Passenger> listOfPassengers = new ArrayList<>();
        listOfPassengers.add(passenger);
        filterPassengersByAge(listOfPassengers, filterByAge);

        PassengerPrinter<Passenger> printPassengerInfo = pass -> System.out.println("Passenger " + pass.getName() + "Age " + pass.getAge());
        printPassengersInfo(listOfPassengers, printPassengerInfo);

        PassengerMapper<Passenger, String> mapToUppercaseName = pass -> pass.getName().toUpperCase();
        printPassengersNameMapper(listOfPassengers, mapToUppercaseName);

        FlightInformationPrinter<String, AirportName, AirportName> flightInfo =
                (flightNumber, departureAirport, arrivalAirport) -> {
                    LOGGER.info("Flight Number: " + flightNumber);
                    LOGGER.info("Departure Airport: " + departureAirport);
                    LOGGER.info("Arrival Airport: " + arrivalAirport);
                };
        printFlightInformation(flight1, flightInfo);

        filterGates(listOfGates, "1");

        printUniqueGates(listOfGates);

        printModifiedGates(listOfGates, "2", "2");

    }
}
