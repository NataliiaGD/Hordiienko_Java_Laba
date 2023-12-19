package com.laba.solvd.airport.interfaces;

@FunctionalInterface
public interface PassengerMapper<T, R> {
    R map(T passenger);

}
