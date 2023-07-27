package org.example.parkinglot.entities.impl;

import org.example.parkinglot.entities.Ticket;
import org.example.parkinglot.entities.Vehicle;

import java.util.Date;

public class TicketImpl implements Ticket {

    private String id;
    private Vehicle vehicle;
    private Date createdAt;

    public TicketImpl(String id, Vehicle vehicle) {
        this.id = id;
        this.vehicle = vehicle;
        this.createdAt = new Date();
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public Date getCreatedAt() {
        return this.createdAt;
    }

    @Override
    public Vehicle getVehicle() {
        return this.vehicle;
    }
}
