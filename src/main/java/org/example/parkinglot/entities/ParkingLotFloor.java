package org.example.parkinglot.entities;

import java.util.List;

public interface ParkingLotFloor {
    String getId();
    List<ParkingSpot> getParkingSpots();
}
