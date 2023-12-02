package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.LuggageType;

public final class Luggage {
    private LuggageType type;
    private double weight;
    private String ownerName;

    public Luggage(LuggageType type, double weight, String ownerName) {
        this.type = type;
        this.weight = weight;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Luggage{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    public LuggageType getType() {
        return type;
    }

    public void setType(LuggageType type) {
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
