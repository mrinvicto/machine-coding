package org.example.parkinglot;

import org.example.parkinglot.commands.Command;
import org.example.parkinglot.commands.impl.AddParkingLotFloorImpl;
import org.example.parkinglot.commands.impl.ParkVehicleCommandImpl;
import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.impl.ParkingLotImpl;
import org.example.parkinglot.services.ParkingLotService;
import org.example.parkinglot.services.ParkingSpotFindingStrategy;
import org.example.parkinglot.services.impl.NearestParkingSpotStrategyImpl;
import org.example.parkinglot.services.impl.ParkingLotServiceImpl;

public class Driver {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLotImpl("New-Delhi-001");
        ParkingSpotFindingStrategy parkingSpotFindingStrategy = new NearestParkingSpotStrategyImpl();
        ParkingLotService parkingLotService = new ParkingLotServiceImpl(parkingLot, parkingSpotFindingStrategy);

        Command[] commands = new Command[]{
                new AddParkingLotFloorImpl(new String[]{"Bike", "10", "Car", "20", "Truck", "5"}, parkingLotService),
                new AddParkingLotFloorImpl(new String[]{"Bike", "10", "Car", "20", "Truck", "5"}, parkingLotService),
                new ParkVehicleCommandImpl(new String[]{"Car", "MH09DR6979", "Brown"}, parkingLotService)
        };

        for (Command currentCommand : commands) {
            if (currentCommand.isValid()) {
                currentCommand.execute();
            } else {
                System.out.println("Invalid command");
            }
        }
    }
}
