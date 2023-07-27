package org.example.parkinglot.commands.impl;

import org.example.parkinglot.commands.Command;
import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.enums.VehicleType;
import org.example.parkinglot.services.ParkingLotService;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddParkingLotFloorImpl extends Command {

    private static final int ARGS_LENGTH = 6;

    public AddParkingLotFloorImpl(String[] args, ParkingLotService parkingLotService) {
        super(args, parkingLotService);
    }

    @Override
    public boolean isValid() {
        return this.args.length == ARGS_LENGTH;
    }

    @Override
    public void execute() {
        Map<VehicleType, Integer> vehicleTypeCapacity = new LinkedHashMap<>();
        vehicleTypeCapacity.put(VehicleType.valueOf(this.args[0]), Integer.parseInt(this.args[1]));
        vehicleTypeCapacity.put(VehicleType.valueOf(this.args[2]), Integer.parseInt(this.args[3]));
        vehicleTypeCapacity.put(VehicleType.valueOf(this.args[4]), Integer.parseInt(this.args[5]));

        this.parkingLotService.addFloor(vehicleTypeCapacity);
    }


}
