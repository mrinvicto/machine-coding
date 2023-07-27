package org.example.parkinglot.entities;

import org.example.parkinglot.enums.VehicleType;

public interface ParkingSpot {
    String getId();
    boolean isOccupied();
    Vehicle getParkedVehicle();
    void setParkedVehicle(Vehicle vehicle);
    VehicleType getVehicleType();
}
