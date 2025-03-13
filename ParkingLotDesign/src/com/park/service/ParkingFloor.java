package com.park.service;

import java.util.Set;
import java.util.TreeSet;

import com.park.entity.VehicleType;

public class ParkingFloor {

	private int parkingFloor;
	private Set<ParkingSlot> parkingSlots;

	public ParkingFloor(int parkingFloor) {
		super();
		this.parkingFloor = parkingFloor;
		this.parkingSlots = new TreeSet<>();
	}

	public void addspot(ParkingSlot slot) {
		parkingSlots.add(slot);
	}

	public ParkingSlot findAvailableSlot(VehicleType type) {
		for (ParkingSlot slot : parkingSlots) {
			if (slot.isAvailable() && slot.getType() == type)
				return slot;
		}
		return null;
	}

}
