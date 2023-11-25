package com.laba.solvd.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Crew {
    private static final Logger LOGGER = LogManager.getLogger(Crew.class);
    private List<Employee> listOfEmployees;

    public Crew(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "listOfEmployees=" + listOfEmployees +
                '}';
    }

    public void saveCrewToFile() {
        String filePath = "employees.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Employee employee : listOfEmployees) {
                writer.write(employee.toString());
                writer.newLine();
            }
            LOGGER.info("Employees saved to file successfully");
        } catch (IOException e) {
            LOGGER.error("Something went wrong " + e.getMessage());
        }

    }

    public List<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public void setListOfEmployees(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public static int calculateNumberOfCrewForFlight(Flight flight) {
        double distance = flight.getDistanceInKilometres();
        if (distance < 1000) {
            return 5;
        } else if (distance < 5000) {
            return 10;
        } else if (distance < 10000) {
            return 15;
        } else {
            return 20;
        }

    }

}
