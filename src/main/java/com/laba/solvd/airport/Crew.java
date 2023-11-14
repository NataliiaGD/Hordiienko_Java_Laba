package com.laba.solvd.airport;

import java.util.Arrays;

public class Crew {
    private Employee[] employees;

    public Crew(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Crew{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }

    public Employee[] getEmployees() {
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
