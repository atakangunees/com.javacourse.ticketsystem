package com.javacourse.ticketsystem.main;

public class Ticket {
	
	private Bus bus;
	private Passenger passenger;
	
	
	public Ticket(Bus bus, Passenger passenger) {
		super();
		this.bus = bus;
		this.passenger = passenger;
	}


	public Bus getBus() {
		return bus;
	}


	public void setBus(Bus bus) {
		this.bus = bus;
	}


	public Passenger getPassenger() {
		return passenger;
	}


	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	
	
	
}
