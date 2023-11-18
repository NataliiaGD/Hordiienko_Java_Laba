package com.laba.solvd.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Crew {
    private static Logger LOGGER = LogManager.getLogger(Crew.class);
    private static Employee[] employees;

    static {
        employees = new Employee[5];
        employees[0] = new Employee("Bob", 35, "abc221", "Pilot", 5);
        employees[1] = new Employee("John", 30, "abc233", "Pilot", 6);
        employees[2] = new Employee("Bred", 25, "abc221", "Crew", 3);
        employees[3] = new Employee("Kate", 28, "abc221", "Crew", 5);
        employees[4] = new Employee("Kelly", 27, "abc221", "Pilot", 4);
    }

    public Crew() {

    }

    @Override
    public String toString() {
        return "Crew{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    public static void saveCrewToFile() {
        String filePath = "employees.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Employee employee : employees) {
                writer.write(employee.toString());
                writer.newLine();
            }
            LOGGER.info("Employees saved to file successfully");
        } catch (IOException e) {
            LOGGER.error("Something went wrong " + e.getMessage());
        }

    }

    public static Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
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
