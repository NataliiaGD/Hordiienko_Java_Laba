package com.laba.solvd.airport.enums;

public enum TicketType {
    ECONOMY_CLASS(800),
    PREMIUM_ECONOMY(1000),
    FIRST_CLASS(1200),
    BUSINESS_CLASS(1500);

    private final double minimalPrice;

    TicketType(double minimalPrice) {
        this.minimalPrice = minimalPrice;
    }

    public double getMinimalPrice() {
        return minimalPrice;
    }
}
