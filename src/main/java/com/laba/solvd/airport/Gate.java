package com.laba.solvd.airport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Gate {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Gate.class);

    private String gateNumber;

    public Gate(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return "Gate{" +
                "gateNumber='" + gateNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gate gate = (Gate) o;
        return gateNumber.equals(gate.gateNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gateNumber);
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    public static void printUniqueGates(List<Gate> listOfGates) {
        listOfGates.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void printModifiedGates(List<Gate> listOfGates, String startsWith, String toAppend) {
        listOfGates.stream()
                .filter(x -> x.getGateNumber().startsWith(startsWith))
                .map(x -> x.getGateNumber().concat(toAppend))
                .forEach(System.out::println);
    }

    public static void filterGates(List<Gate> listOfGates, String startsWith) {
        List<Gate> gatesNumber = listOfGates.stream()
                .filter(x -> x.getGateNumber().startsWith(startsWith))
                .collect(Collectors.toList());
        LOGGER.info(gatesNumber);

    }

}
