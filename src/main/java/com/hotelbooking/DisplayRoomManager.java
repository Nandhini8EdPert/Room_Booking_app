package com.hotelbooking;

import java.util.HashMap;

public class DisplayRoomManager {
	public static HashMap<String, Double> roomAvailable = new HashMap<String, Double>();
	static {
		roomAvailable.put("Mountain View", 25000.0);
		roomAvailable.put("Night Ocean View", 20000.0);
		roomAvailable.put("Night City View", 15000.0);
	}

	/**
	 * listing the rooms available in the hotel
	 */
	public static void displayRoomTypes() {
		System.out.println("/*** Available Rooms ***/");
		for (String rooms : DisplayRoomManager.roomAvailable.keySet()) {
			double price = DisplayRoomManager.roomAvailable.get(rooms);
			System.out.println("Room --> " + rooms + ", Price --> " + price);
		}
	}

	

}
