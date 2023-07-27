package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.ParkingLotFloor;
import org.example.parkinglot.entities.ParkingSpot;
import org.example.parkinglot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ParkingLotFloorImpl implements ParkingLotFloor {
    private String id;
    private List<ParkingSpot> spots;

    public ParkingLotFloorImpl(String id, Map<VehicleType, Integer> vehicleTypeCapacity) {
        this.id = id;
        this.spots = generateParkingSpots(vehicleTypeCapacity);
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public List<ParkingSpot> getParkingSpots() {
        return this.spots;
    }

    private List<ParkingSpot> generateParkingSpots(Map<VehicleType, Integer> vehicleTypeCapacity) {

        List<ParkingSpot> parkingSpots = new ArrayList<>();
        final int[] count = {0};

        vehicleTypeCapacity.forEach((vehicleType, capacity) -> {

            for(int i = 0; i < capacity; i++) {
                count[0] = count[0] + 1;
                String spotId = String.format("%s-%s", this.id, count[0]);
                parkingSpots.add(new ParkingSpotImpl(spotId, vehicleType));
            }

        });

        return parkingSpots;
    }
}
