package com.park.service;

public class ParkingLot {

	private Integer id;
	private String lotName;
	private String address;
	private Integer floors;
	private Integer parkingSlots;
	private Integer availableSlots;

	public ParkingLot(Integer id, String lotName, String address, Integer floors, Integer parkingSlots,
			Integer availableSlots) {
		super();
		this.id = id;
		this.lotName = lotName;
		this.address = address;
		this.floors = floors;
		this.parkingSlots = parkingSlots;
		this.availableSlots = availableSlots;
	}
	
	

}
