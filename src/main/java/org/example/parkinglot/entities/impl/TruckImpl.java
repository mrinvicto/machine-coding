package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.enums.VehicleType;

public class TruckImpl implements Vehicle {
    private final VehicleType vehicleType = VehicleType.Truck;
    private String registrationNumber;
    private String color;

    public TruckImpl(String registrationNumber, String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
