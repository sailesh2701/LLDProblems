package com.park.entity;

public class ParkingTicket {
	private String ticketId;
	private String vehicleNumber;
	private String spotId;
	private long entryTime;
	private Long exitTime;

	public ParkingTicket(String ticketId, String vehicleNumber, String spotId) {
		this.ticketId = ticketId;
		this.vehicleNumber = vehicleNumber;
		this.spotId = spotId;
		this.entryTime = System.currentTimeMillis();
		this.exitTime = null;
	}

	public void markExit() {
		this.exitTime = System.currentTimeMillis();
	}

	public long getDuration() {
		return (exitTime != null) ? (exitTime - entryTime) / 1000 : 0;
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getSpotId() {
		return spotId;
	}

	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	public long getEntryTime() {
		return entryTime;
	}

	public void setEntryTime(long entryTime) {
		this.entryTime = entryTime;
	}

	public Long getExitTime() {
		return exitTime;
	}

	public void setExitTime(Long exitTime) {
		this.exitTime = exitTime;
	}
}
