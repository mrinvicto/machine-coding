package org.example.parkinglot.services.impl;

import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.ParkingLotFloor;
import org.example.parkinglot.entities.ParkingSpot;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.services.ParkingSpotFindingStrategy;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class NearestParkingSpotStrategyImpl implements ParkingSpotFindingStrategy {

    @Override
    public Optional<ParkingSpot> findSpot(ParkingLot parkingLot, Vehicle vehicle) {
        List<ParkingLotFloor> floors = parkingLot.getFloors();

        for(int i = 0; i < floors.size(); i++) {
            ParkingLotFloor currentFloor = floors.get(i);
            for(int j = 0; j < currentFloor.getParkingSpots().size(); j++) {
                ParkingSpot currentSpot = currentFloor.getParkingSpots().get(j);
                if(!currentSpot.isOccupied() && currentSpot.getVehicleType() == vehicle.getVehicleType()) {
                    return Optional.of(currentSpot);
                }
            }
        }

        return Optional.empty();
    }
}
