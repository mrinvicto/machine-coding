package org.example.parkinglot.entities;

import org.example.parkinglot.enums.VehicleType;

public interface Vehicle {
    VehicleType getVehicleType();
    String getRegistrationNumber();
    String getColor();
}
