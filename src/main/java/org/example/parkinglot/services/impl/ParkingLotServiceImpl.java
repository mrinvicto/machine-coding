package org.example.parkinglot.services.impl;

import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.ParkingSpot;
import org.example.parkinglot.entities.Ticket;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.entities.impl.TicketImpl;
import org.example.parkinglot.enums.VehicleType;
import org.example.parkinglot.exceptions.ParkingLotFullException;
import org.example.parkinglot.services.ParkingLotService;
import org.example.parkinglot.services.ParkingSpotFindingStrategy;

import java.util.Map;
import java.util.Optional;

public class ParkingLotServiceImpl implements ParkingLotService {

    private ParkingLot parkingLot;
    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;

    public ParkingLotServiceImpl(ParkingLot parkingLot, ParkingSpotFindingStrategy parkingSpotFindingStrategy) {
        this.parkingLot = parkingLot;
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
    }

    @Override
    public void addFloor(Map<VehicleType, Integer> vehicleTypeCapacity) {
        this.parkingLot.addFloor(vehicleTypeCapacity);
    }

    @Override
    public Ticket ParkVehicle(Vehicle vehicle) {
        Optional<ParkingSpot> parkingSpotOptional = this.parkingSpotFindingStrategy.findSpot(this.parkingLot, vehicle);

        if(parkingSpotOptional.isPresent()) {
            ParkingSpot availableSpot = parkingSpotOptional.get();
            availableSpot.setParkedVehicle(vehicle);
            return new TicketImpl(availableSpot.getId(), vehicle);
        } else {
            throw new ParkingLotFullException(String.format("Parking Lot has reached its capacity for %s", vehicle.getVehicleType()));
        }
    }
}
