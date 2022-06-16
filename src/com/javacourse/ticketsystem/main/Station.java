package com.javacourse.ticketsystem.main;

public class Station {
	
	private String name;
	private City city;
	
	public Station(String name, City city) {
		
		this.name = name;
		this.city = city;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}
	
	@Override
	public String toString() {
	
		return this.name + " " + this.city;
	}
	 

}
