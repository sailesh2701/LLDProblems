package com.park.entity;

public abstract class Vehicle {

	public String vehicleNumber;
	public VehicleType type;

	public Vehicle(String vehicleNumber, VehicleType type) {
		this.vehicleNumber = vehicleNumber;
		this.type = type;
	}

}
