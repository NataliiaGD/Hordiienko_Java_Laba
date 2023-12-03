package com.laba.solvd.airport.interfaces;

@FunctionalInterface
public interface FlightInformationPrinter<T, U, V> {
    void printFlightInformation(T t, U u, V v);

}
