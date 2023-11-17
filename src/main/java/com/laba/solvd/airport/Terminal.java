package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.TerminalType;
import com.laba.solvd.airport.interfaces.TerminalOperation;

public class Terminal implements TerminalOperation {
    private String name;
    private TerminalType terminalType;

    public Terminal(String name, TerminalType terminalType) {
        this.name = name;
        this.terminalType = terminalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TerminalType getTerminalType() {
        return terminalType;
    }

    public void setTerminalType(TerminalType terminalType) {
        this.terminalType = terminalType;
    }

    @Override
    public void performTerminalOperation() {
        if (terminalType == TerminalType.INTERNATIONAL) {
            System.out.println("International terminal operation");
        } else {
            System.out.println("Domestic terminal operation");
        }
    }
}
