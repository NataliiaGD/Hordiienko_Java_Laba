package com.laba.solvd.airport;

public class Aircraft {
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
}
