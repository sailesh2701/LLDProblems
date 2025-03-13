package com.park.main;

import com.park.entity.Car;
import com.park.entity.ParkingTicket;
import com.park.entity.Vehicle;
import com.park.entity.VehicleType;
import com.park.service.ParkingFloor;
import com.park.service.ParkingLot;
import com.park.service.ParkingSlot;

public class ParkingSlotBooking {

	public static void main(String[] args) {
		ParkingLot parkingLot = new ParkingLot("City Center Parking");

		ParkingFloor floor1 = new ParkingFloor(1);
		floor1.addspot(new ParkingSlot("1A", VehicleType.CAR));
		floor1.addspot(new ParkingSlot("1B", VehicleType.BIKE));
		parkingLot.addFloor(floor1);

		Vehicle car = new Car("KA-01-1234");
		ParkingTicket ticket = parkingLot.parkVehicle(car);

		if (ticket != null) {
			System.out.println("Vehicle parked. Ticket ID: " + ticket.getTicketId());
			// Simulate exit
			double fee = parkingLot.unparkVehicle(ticket.getTicketId());
			System.out.println("Parking fee: Rs. " + fee);
		} else {
			System.out.println("No parking spot available.");
		}
	}

}
