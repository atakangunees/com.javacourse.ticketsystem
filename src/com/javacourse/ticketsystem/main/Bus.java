package com.javacourse.ticketsystem.main;

public class Bus {
	
	private String firmName; 
	private Station from;
	private Station to;
	private int capacity;
    private Passenger[] passenger;
	
    
    public Bus(String firmName, Station from, Station to, int capacity) {
		super();
		this.firmName = firmName;
		this.from = from;
		this.to = to;
		this.capacity = capacity;
	}


	public String getFirmName() {
		return firmName;
	}


	public void setFirmName(String firmName) {
		this.firmName = firmName;
	}


	public Station getFrom() {
		return from;
	}


	public void setFrom(Station from) {
		this.from = from;
	}


	public Station getTo() {
		return to;
	}


	public void setTo(Station to) {
		this.to = to;
	}


	public int getCapacity() {
		return capacity;
	}

	public Passenger[] getPassenger() {
		return passenger;
	}


	public void setPassenger(Passenger[] passenger) {
		this.passenger = passenger;
	}
    
   @Override
public String toString() {
	
	return this.firmName + this.capacity + this.from + this.to;
} 
    
    
    
    
}
