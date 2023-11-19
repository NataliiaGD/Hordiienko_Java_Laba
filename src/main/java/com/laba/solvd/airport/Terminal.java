package com.laba.solvd.airport;

import com.laba.solvd.airport.enums.TerminalType;
import com.laba.solvd.airport.exceptions.InvalidTerminalTypeException;
import com.laba.solvd.airport.interfaces.TerminalOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Terminal implements TerminalOperation {
    private static Logger LOGGER = LogManager.getLogger(Terminal.class);
    private String name;
    private TerminalType terminalType;
    private List<Gate> listOfGates;

    public Terminal(String name, TerminalType terminalType, List<Gate> listOfGates) {
        this.name = name;
        this.terminalType = terminalType;
        this.listOfGates = listOfGates;
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

    public List<Gate> getListOfGates() {
        return listOfGates;
    }

    public void setListOfGates(List<Gate> listOfGates) {
        this.listOfGates = listOfGates;
    }

    @Override
    public void performTerminalOperation() throws InvalidTerminalTypeException {
        if (terminalType == TerminalType.INTERNATIONAL) {
            LOGGER.info("International terminal operation");
        } else if (terminalType == TerminalType.DOMESTIC) {
            LOGGER.info("Domestic terminal operation");
        } else {
            throw new InvalidTerminalTypeException("Terminal should be International or Domestic");
        }
    }
}
