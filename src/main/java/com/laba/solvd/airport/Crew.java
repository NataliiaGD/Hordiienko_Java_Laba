package com.laba.solvd.airport;

public class Crew extends Employee {
    private String position;
    private int flightHours;
    private Aircraft primaryAircraft;

    public Crew(String name, int age, String employeeId, int workingExperience,
                String position, int flightHours, Aircraft primaryAircraft) {
        super(name, age, employeeId, workingExperience);
        this.position = position;
        this.flightHours = flightHours;
        this.primaryAircraft = primaryAircraft;
    }


    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getFlightHours() {
        return flightHours;
    }

    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }

    public Aircraft getPrimaryAircraft() {
        return primaryAircraft;
    }

    public void setPrimaryAircraft(Aircraft primaryAircraft) {
        this.primaryAircraft = primaryAircraft;
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
