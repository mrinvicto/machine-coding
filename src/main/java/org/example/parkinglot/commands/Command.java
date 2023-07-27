package org.example.parkinglot.commands;

import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.services.ParkingLotService;

public abstract class Command {
    protected String[] args;
    protected ParkingLotService parkingLotService;

    public Command(String[] args, ParkingLotService parkingLotService) {
        this.args = args;
        this.parkingLotService = parkingLotService;
    }

    public abstract boolean isValid();
    public abstract void execute();
}
