package com.laba.solvd.airport;

import java.util.Date;

public class BoardingPass {
    private String passengerName;
    private String seatNumber;
    private String flightNumber;
    private Date boardingTime;
    private String gateNumber;

    public BoardingPass(String passengerName, String seatNumber, String flightNumber, Date boardingTime, String gateNumber) {
        this.passengerName = passengerName;
        this.seatNumber = seatNumber;
        this.flightNumber = flightNumber;
        this.boardingTime = boardingTime;
        this.gateNumber = gateNumber;
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

    public Date getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(Date boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(String gateNumber) {
        this.gateNumber = gateNumber;
    }
}