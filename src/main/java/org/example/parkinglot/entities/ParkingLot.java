package org.example.parkinglot.entities;

import org.example.parkinglot.enums.VehicleType;

import java.util.List;
import java.util.Map;

public interface ParkingLot {
    String getId();
    List<ParkingLotFloor> getFloors();
    void addFloor(Map<VehicleType, Integer> vehicleTypeCapacity);
}
