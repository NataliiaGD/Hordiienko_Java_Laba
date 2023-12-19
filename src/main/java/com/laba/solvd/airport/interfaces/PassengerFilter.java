package com.laba.solvd.airport.interfaces;

@FunctionalInterface
public interface PassengerFilter<T> {
    boolean filter(T passenger);
}
