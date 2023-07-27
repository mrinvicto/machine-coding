package org.example.parkinglot.services.impl;

import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.entities.impl.BikeImpl;
import org.example.parkinglot.entities.impl.CarImpl;
import org.example.parkinglot.entities.impl.TruckImpl;
import org.example.parkinglot.enums.VehicleType;

public class VehicleService {
    public static Vehicle getVehicle(String vehicleTypeStr, String registrationNumber, String color) {
        VehicleType vehicleType = VehicleType.valueOf(vehicleTypeStr);

        switch (vehicleType) {
            case Bike: return new BikeImpl(registrationNumber, color);
            case Car: return new CarImpl(registrationNumber, color);
            case Truck: return new TruckImpl(registrationNumber, color);
            default: throw new IllegalArgumentException(String.format("Invalid Vehicle Type - %s", vehicleTypeStr));
        }
    }
}
