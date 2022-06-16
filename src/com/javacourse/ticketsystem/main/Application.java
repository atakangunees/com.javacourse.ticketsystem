package com.javacourse.ticketsystem.main;

import java.util.Scanner;

import javax.print.attribute.standard.Chromaticity;

public class Application {
	static DataBase db = new DataBase();

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
	
		
		while(true){
			
			System.out.println("Admin-> 1");
			System.out.println("Yolcu->2");
            System.out.println("Çýkýþ->3");		
		    int secim = scn.nextInt();
				        scn.nextLine();
			
		   if(secim == 3) {
			   
			   System.out.println("Çýkýþ Yapýlýyor..");
		  
		       break;
		   
		   }else if(secim == 1) {
			   while(true) {
				   
				   System.out.println("Ýstasyon ekle-> 1");
				   System.out.println("Otobüs ekle->2");
				   System.out.println("Üst Menü->3");
				   int adminSecim = scn.nextInt();
				                    scn.nextLine();
				    
				   if(adminSecim == 3 ) {
					   System.out.println("Üst Menüye Dönülüyor.");
					   break;
					   
				   }else if(adminSecim == 1){
					   
					   System.out.print("Ýstasyon Adý: ");
					String stationName = scn.nextLine();
					
					   System.out.println("Ýstasyon Plaka Kodu : ");
					int plakaKodu = scn.nextInt();
					                scn.nextLine();
					                
					    Station s = new Station(stationName,plakaKoduToCity(plakaKodu));   
					    db.saveStation(s);
					   
				   }else if(adminSecim == 2) {
					   System.out.print("Firma Adý: ");
					   String firmName = scn.nextLine();
						
					   System.out.println("Kalkýþ : ");
					   showStations();
					   int stationIndex = scn.nextInt();
						                  scn.nextLine();
					
					   Station From = db.getStationByIndex(stationIndex);
					   
					   
					   System.out.println("Varýþ: ");
					   showStations();
					   int stationIndex2 = scn.nextInt();
		                                   scn.nextLine();
		                                   
		               Station to = db.getStationByIndex(stationIndex2); 
		               
		               
					   System.out.println("Kapasite : ");
					   
					   int capacity = scn.nextInt();
		                                   scn.nextLine();
		                                   
					   Bus b = new Bus(firmName, From, to , capacity);
					   
					   db.saveBus(b);
					   
				  }
	
			   }
			   	   
		   }else if(secim == 2) {
			   System.out.print("Yolcu Adý: ");
			   String pasName = scn.nextLine();
			   
			   System.out.print("Yolcu SoyAdý: ");
			   String pasSurname = scn.nextLine();
			   
			   System.out.print("Otobus Seçiniz : ");
			   int busChoose = scn.nextInt();
			                   scn.nextLine();
			                   showBuses();
			   
			   Bus b = db.getBusByIndex( busChoose);
			   
			   
			   
		   }
		}
	}

	private static void showBuses() {
		Bus[] buses = db.getAllBuses();
		
		for(int i = 0; i < buses.length; i++) {
			
			System.out.println((i + 1) + " " + buses[i]);
		}
		
	}

	private static void showStations() {
		
		Station[] stations = db.getAllStations();
		
		for(int i = 0; i < stations.length ; i++) {
			
			System.out.println((i + 1) + " "  + stations[i]);
			
		}
		
	}

	private static City plakaKoduToCity(int plakaKodu) {
		switch(plakaKodu) {
		
		case 6:
		
			return City.ANKARA;
			
		case 34:
			return City.ISTANBUL;
		
		case 7:
			return City.ANTALYA;
		
		case 35:
			return City.IZMIR;
			
		case 49:
			return City.MUS;
			
		 default:
			 
			return City.NULL;  
				  
		
		}
		
		
		
		
	}
}
