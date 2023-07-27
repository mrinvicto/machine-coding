package org.example.parkinglot.services;

import org.example.parkinglot.entities.Ticket;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.enums.VehicleType;

import java.util.Map;

public interface ParkingLotService {
    Ticket ParkVehicle(Vehicle vehicle);
    void addFloor(Map<VehicleType, Integer> vehicleTypeCapacity);
}
