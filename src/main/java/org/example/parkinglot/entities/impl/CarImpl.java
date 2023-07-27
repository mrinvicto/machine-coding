package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.enums.VehicleType;

public class CarImpl implements Vehicle {
    private final VehicleType vehicleType = VehicleType.Car;
    private final String registrationNumber;
    private final String color;

    public CarImpl(String registrationNumber, String color) {
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
