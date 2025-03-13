package com.park.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.park.entity.ParkingTicket;
import com.park.entity.Vehicle;

public class ParkingLot {

	private String name;
	private List<ParkingFloor> floors;
	private Map<String, ParkingTicket> activeTickets;

	public ParkingLot(String name) {
		this.name = name;
		this.floors = new ArrayList<>();
		this.activeTickets = new HashMap<>();
	}

	public void addFloor(ParkingFloor floor) {
		floors.add(floor);
	}

	public ParkingTicket parkVehicle(Vehicle vehicle) {
		for (ParkingFloor floor : floors) {
			ParkingSlot spot = floor.findAvailableSlot(vehicle.type);
			if (spot != null && spot.assignVehicle(vehicle)) {
				String ticketId = UUID.randomUUID().toString();
				ParkingTicket ticket = new ParkingTicket(ticketId, vehicle.vehicleNumber, spot.getSpotId());
				activeTickets.put(ticketId, ticket);
				return ticket;
			}
		}
		return null; // No available spot
	}
	
	public double unparkVehicle(String ticketId) {
        ParkingTicket ticket = activeTickets.remove(ticketId);
        if (ticket != null) {
            ticket.markExit();
            return ParkingFeeCalculator.calculateFee(ticket);
        }
        return 0;
    }


}
