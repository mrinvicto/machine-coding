package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.ParkingLotFloor;
import org.example.parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLotImpl implements ParkingLot {
    private String id;
    private List<ParkingLotFloor> floors = new ArrayList<>();

    public ParkingLotImpl(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public List<ParkingLotFloor> getFloors() {
        return this.floors;
    }

    @Override
    public void addFloor(Map<VehicleType, Integer> vehicleTypeCapacity) {
        String parkingSpotId = String.format("%s-%s", this.id, this.floors.size() + 1);
        this.floors.add(new ParkingLotFloorImpl(parkingSpotId, vehicleTypeCapacity));
    }
}
