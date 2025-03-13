package com.park.service;

import com.park.entity.Vehicle;
import com.park.entity.VehicleType;

public class ParkingSlot {
	private String spotId;
	private VehicleType type;
	private boolean isOccupied;
	private Vehicle vehicle;

	public ParkingSlot(String spotId, VehicleType type) {
		this.spotId = spotId;
		this.type = type;
		this.isOccupied = false;
	}

	public boolean assignVehicle(Vehicle vehicle) {
		if (!isOccupied && vehicle.type == this.type) {
			this.vehicle = vehicle;
			this.isOccupied = true;
			return true;
		}
		return false;
	}

	public void removeVehicle() {
		this.vehicle = null;
		this.isOccupied = false;
	}

	public boolean isAvailable() {
		return !isOccupied;
	}

	public VehicleType getType() {
		return type;
	}
}
