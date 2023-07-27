package org.example.parkinglot.exceptions;

public class ParkingLotFullException extends RuntimeException{
    public ParkingLotFullException(String message) {
        super(message);
    }
}
