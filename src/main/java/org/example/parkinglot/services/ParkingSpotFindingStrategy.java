package org.example.parkinglot.services;

import org.example.parkinglot.entities.ParkingLot;
import org.example.parkinglot.entities.ParkingSpot;
import org.example.parkinglot.entities.Vehicle;

import java.util.Optional;

public interface ParkingSpotFindingStrategy {
    Optional<ParkingSpot> findSpot(ParkingLot parkingLot, Vehicle vehicle);
}
