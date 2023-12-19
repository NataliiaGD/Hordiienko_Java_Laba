package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.AirlineName;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;

public class Airline {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Airline.class);
    private AirlineName airlineName;
    private int numberOfEmployees;
    private List<Aircraft> listOfAircraft;
    private CustomLinkedList<Employee> listOfEmployees;

    public Airline(AirlineName airlineName, int numberOfEmployees, List<Aircraft> listOfAircraft, CustomLinkedList<Employee> listOfEmployees) {
        this.airlineName = airlineName;
        this.numberOfEmployees = numberOfEmployees;
        this.listOfAircraft = listOfAircraft;
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return numberOfEmployees == airline.numberOfEmployees && airlineName == airline.airlineName && listOfAircraft.equals(airline.listOfAircraft) && listOfEmployees.equals(airline.listOfEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airlineName, numberOfEmployees, listOfAircraft, listOfEmployees);
    }

    public AirlineName getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(AirlineName airlineName) {
        this.airlineName = airlineName;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public List<Aircraft> getListOfAircraft() {
        return listOfAircraft;
    }

    public void setListOfAircraft(List<Aircraft> listOfAircraft) {
        this.listOfAircraft = listOfAircraft;
    }

    public CustomLinkedList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(CustomLinkedList<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public void printAirLineInfo() {
        LOGGER.info(getAirlineName() + " has the following fleet: " + getListOfAircraft());
    }


}
