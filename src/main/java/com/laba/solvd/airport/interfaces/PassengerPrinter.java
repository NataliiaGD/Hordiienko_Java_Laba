package com.laba.solvd.airport.interfaces;

@FunctionalInterface
public interface PassengerPrinter<T> {
    void print(T passenger);
}
