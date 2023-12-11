package com.laba.solvd.airport.threads;

import com.laba.solvd.airport.Aircraft;
import com.laba.solvd.airport.Flight;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDateTime;

import static com.laba.solvd.airport.enums.AirportName.DOHA_HAMMAD;
import static com.laba.solvd.airport.enums.AirportName.SYDNEY;

public class Program {
    static {
        System.setProperty("log4j.configurationFile", "log4j2.xml");
    }

    private static final Logger LOGGER = LogManager.getLogger(Program.class);

    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft(1, "Boeing777");
        Flight flight = new Flight("1CDF", DOHA_HAMMAD, SYDNEY,
                LocalDateTime.now().minusHours(10), LocalDateTime.now(), 5000);

        Thread thread = new Thread(flight);
        thread.start();
        aircraft.start();

    }
}
