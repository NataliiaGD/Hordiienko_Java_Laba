package com.laba.solvd.airport;

import com.laba.solvd.airport.interfaces.Flyable;

public class Aircraft implements Flyable {
    private int aircraftId;
    private String type;

    public Aircraft(int aircraftId, String type) {
        this.aircraftId = aircraftId;
        this.type = type;
    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void fly() {
        System.out.println("AircraftId " + getAircraftId() + "," + " Type " + getType() + " is flying");
    }
}
