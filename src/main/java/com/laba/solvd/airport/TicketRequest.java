package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.TicketType;

import static com.laba.solvd.airport.enums.TicketType.*;

public class TicketRequest {
    private TicketType ticketType;
    private Luggage luggage;
    private Flight flight;

    public TicketRequest(TicketType ticketType, Luggage luggage, Flight flight) {
        this.ticketType = ticketType;
        this.luggage = luggage;
        this.flight = flight;
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    public Luggage getLuggage() {
        return luggage;
    }

    public void setLuggage(Luggage luggage) {
        this.luggage = luggage;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public static TicketType checkTicketTypeAccordingToThePrice(double price) {

        if (price <= ECONOMY_CLASS.getMinimalPrice()) {
            return ECONOMY_CLASS;
        } else if (price <= PREMIUM_ECONOMY.getMinimalPrice()) {
            return PREMIUM_ECONOMY;
        } else if (price <= FIRST_CLASS.getMinimalPrice()) {
            return FIRST_CLASS;
        } else {
            return BUSINESS_CLASS;
        }
    }

    public double calculateLuggagePrice() {
        double basePrice = 200;
        if (luggage.getWeight() <= 10) {
            basePrice += 50;
        } else if (luggage.getWeight() <= 20) {
            basePrice += 100;
        } else if (luggage.getWeight() <= 40) {
            basePrice += 200;
        } else {
            basePrice += 300;
        }

        if (flight.getDistanceInKilometres() > 5000) {
            basePrice *= 1.1;
        }
        return basePrice;
    }

    private double calculateDistanceCoefficient() {
        if (flight.getDistanceInKilometres() > 5000) {
            return 1.1;
        } else {
            return 1.0;
        }
    }

    public double calculateTotalPrice() {
        double minimalPrice = ticketType.getMinimalPrice();
        double luggagePrice = calculateLuggagePrice();
        double distanceCoefficient = calculateDistanceCoefficient();
        return minimalPrice + luggagePrice + distanceCoefficient;
    }
}
