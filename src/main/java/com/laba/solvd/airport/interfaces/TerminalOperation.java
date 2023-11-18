package com.laba.solvd.airport.interfaces;

import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;

public interface TerminalOperation {
    void performTerminalOperation() throws InvalidTerminalTypeException;
}
