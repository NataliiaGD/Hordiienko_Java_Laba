package com.laba.solvd.airport;

public class Luggage {
    private String type;
    private double weight;
    private String ownerName;

    public Luggage(String type, double weight, String ownerName) {
        this.type = type;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
