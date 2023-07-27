package org.example.parkinglot.entities;

import java.util.Date;

public interface Ticket {
    String getId();
    Date getCreatedAt();
    Vehicle getVehicle();
}
