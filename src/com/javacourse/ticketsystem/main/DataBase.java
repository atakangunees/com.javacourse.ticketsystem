package com.javacourse.ticketsystem.main;

public class DataBase {
	
	private Station[] stations;
	private Bus[] buses;
	
	public DataBase() {
	 this.stations = new Station[1];
	 this.buses = new Bus[1];
	}

	public Station saveStation(Station s) {
		
	 
		this.addStation(s);
		
		
		
		return s;
		
	}

	public void addStation(Station s) {
		
		if(this.stations[0] == null) {
			
			this.stations[0] = s;
			
		}else {
			
			Station[] newArr = new Station[this.stations.length + 1];
			
			for(int i = 0 ;i < this.stations.length ; i++) {
				
				newArr[i] = this.stations[i];
			}
			
			  
			newArr[newArr.length - 1] = s;
			
			this.stations = newArr; 
			
			 
			
		}
		
		
				
				
		
		
	}

	public Station[] getAllStations() {
		
		return this.stations;
	}

	public Station getStationByIndex(int stationIndex) {
		
		return this.stations[stationIndex -1];
	}

	public void saveBus(Bus b) {
		
		this.addBus(b);
		
		
		
	}

	private void addBus(Bus b) {
          if(this.buses[0] == null) {
			
			this.buses[0] = b;
			
		}else {
			
			Bus[] newArr = new Bus[this.buses.length + 1];
			
			for(int i = 0 ;i < this.buses.length ; i++) {
				
				newArr[i] = this.buses[i];
			}
			
			  
			newArr[newArr.length - 1] = b;
			
			this.buses = newArr; 
			
	}
}

	public Bus[] getAllBuses() {
		
		return this.buses;
	}

	public Bus getBusByIndex(int busChoose) {
		
		return this.buses[busChoose-1];
	}

	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
