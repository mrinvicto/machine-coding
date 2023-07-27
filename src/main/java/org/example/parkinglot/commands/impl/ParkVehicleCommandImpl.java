package org.example.parkinglot.commands.impl;

import org.example.parkinglot.commands.Command;
import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.Ticket;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.services.ParkingLotService;
import org.example.parkinglot.services.impl.VehicleService;

public class ParkVehicleCommandImpl extends Command {

    private static final int ARGS_LENGTH = 3;

    public ParkVehicleCommandImpl(String[] args, ParkingLotService parkingLotService) {
        super(args, parkingLotService);
    }

    @Override
    public boolean isValid() {
        return this.args.length == ARGS_LENGTH;
    }

    @Override
    public void execute() {
        Vehicle vehicle = VehicleService.getVehicle(this.args[0], this.args[1], this.args[2]);
        Ticket ticket = this.parkingLotService.ParkVehicle(vehicle);
        System.out.printf("Parked Vehicle with ticketId %s\n", ticket.getId());
    }
}
