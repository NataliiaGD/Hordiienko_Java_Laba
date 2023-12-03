package com.laba.solvd.airport;

import com.laba.solvd.airport.interfaces.Flyable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Aircraft implements Flyable {
    private static final Logger LOGGER = LogManager.getLogger(Aircraft.class);
    private int aircraftId;
    private String type;

    public Aircraft(int aircraftId, String type) {
        this.aircraftId = aircraftId;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftId=" + aircraftId +
                ", type='" + type + '\'' +
                '}';
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
        LOGGER.info("AircraftId " + getAircraftId() + "," + " Type " + getType() + " is flying");
    }
}
