package com.park.service;

import com.park.entity.ParkingTicket;

public class ParkingFeeCalculator {
	private static final double HOURLY_RATE = 10.0;

	public static double calculateFee(ParkingTicket ticket) {
		long duration = ticket.getDuration();
		return (duration / 3600.0) * HOURLY_RATE;
	}
}
