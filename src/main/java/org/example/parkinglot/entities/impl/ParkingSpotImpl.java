package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.ParkingSpot;
import org.example.parkinglot.entities.Vehicle;
import org.example.parkinglot.enums.VehicleType;
import org.example.parkinglot.exceptions.IllegalOperationException;

public class ParkingSpotImpl implements ParkingSpot {

    private String id;
    private VehicleType vehicleType;

    private Vehicle parkedVehicle;

    public ParkingSpotImpl(String id, VehicleType vehicleType) {
        this.id = id;
        this.vehicleType = vehicleType;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public boolean isOccupied() {
        return this.parkedVehicle != null;
    }

    @Override
    public Vehicle getParkedVehicle() {
        return this.parkedVehicle;
    }

    @Override
    public void setParkedVehicle(Vehicle vehicle) {
        if(this.isOccupied()) {
            throw new IllegalOperationException(String.format("Cannot store Vehicle at the spot %s as its already occupied", this.id));
        }

        if(vehicle.getVehicleType() != this.vehicleType) {
            throw new IllegalOperationException(String.format("Cannot store Vehicle at the spot %s as its not of correct type", this.id));
        }

        this.parkedVehicle = vehicle;
    }

    @Override
    public VehicleType getVehicleType() {
        return this.vehicleType;
    }

}
