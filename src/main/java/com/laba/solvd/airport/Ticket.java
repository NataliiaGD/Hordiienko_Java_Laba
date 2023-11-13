package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.TicketType;

public class Ticket {
    private double price;

    public Ticket(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static TicketType checkTicketTypeAccordingToThePrice(double price) {
        if (price <= 500) {
            return TicketType.ECONOMY_CLASS;
        } else if (price <= 1000) {
            return TicketType.PREMIUM_ECONOMY;
        } else if (price <= 1500) {
            return TicketType.FIRST_CLASS;
        } else {
            return TicketType.BUSINESS_CLASS;
        }
    }
}
