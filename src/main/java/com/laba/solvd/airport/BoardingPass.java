package com.laba.solvd.airport;

import java.time.LocalDateTime;
import java.util.Random;

public class BoardingPass {
    private String passengerName;
    private String seatNumber;
    private String flightNumber;
    private LocalDateTime boardingTime;
    private String gateNumber;
    private static final int MAX_SEAT_NUMBER = 150;

    public BoardingPass(String passengerName, String seatNumber, String flightNumber,
                        LocalDateTime boardingTime, String gateNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
        this.boardingTime = boardingTime;
        this.gateNumber = gateNumber;
    }

    public BoardingPass() {

    }

    @Override
    public String toString() {
        return "BoardingPass{" +
                "passengerName='" + passengerName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", boardingTime=" + boardingTime +
                ", gateNumber='" + gateNumber + '\'' +
                '}';
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public LocalDateTime getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(LocalDateTime boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }

    private static int generateRandomSeat() {
        Random random = new Random();
        return random.nextInt(MAX_SEAT_NUMBER) + 1;
    }


    public static BoardingPass generateBoardingPass(Passenger passenger, Flight flight, Gate gate) {
        String name = passenger.getName();
        String seatNumber = "A" + generateRandomSeat();
        String flightNumber = flight.getFlightNumber();
        LocalDateTime boardingTime = flight.getDepartureTime().minusHours(1);
        String gateNumber = gate.getGateNumber();

        return new BoardingPass(name, seatNumber, flightNumber, boardingTime, gateNumber);
    }

}