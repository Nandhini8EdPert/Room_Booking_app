package com.hotelbooking;

import java.util.HashMap;

public class DisplayFacilityManager {
	/**
	 * hash map declaration
	 */
	static public HashMap<String, Integer> acOption = new HashMap<String, Integer>();
	static {
		acOption.put("With AC", 10);
		acOption.put("Without AC", 0);
	}

	static public HashMap<String, Integer> foodOption = new HashMap<String, Integer>();
	static {
		foodOption.put("With Food", 100);
		foodOption.put("Without Food", 0);
	}

	public static HashMap<String, Integer> pickUpDropOption = new HashMap<String, Integer>();
	static {
		pickUpDropOption.put("Need a Pik-Up and Drop", 700);
		pickUpDropOption.put("Not interested in Transport option", 0);
	}

	/**
	 * to display the option with AC allowing user to choose their wish
	 * 
	 * @param acChoice
	 * @return acCharge
	 */
	public static void displayAcOption() {
		for (String acWish : acOption.keySet()) {
			double acCharge = acOption.get(acWish);
			System.out.println("Room --> " + acWish + ", Price --> " + acCharge);
		}
	}

	/**
	 * display option with food allowing user to choose their wish
	 * 
	 * @param foodChoice
	 */
	public static void displayfoodNofood() {
		for (String foodWish : foodOption.keySet()) {
			double foodCharge = foodOption.get(foodWish);
			System.out.println("Room --> " + foodWish + ", Price --> " + foodCharge);
		}
	}

	/**
	 * display option with Pick-Up and Drop allowing user to choose their wish
	 * 
	 * @param pickUpDropChoice
	 * @return pickUpDropCharge
	 */
	public static void pickUpDropDisplay() {
		for (String pickUpDropWish : pickUpDropOption.keySet()) {
			double pickUpDropCharge = pickUpDropOption.get(pickUpDropWish);
			System.out.println("Room --> " + pickUpDropWish + ", Price --> " + pickUpDropCharge);
		}
	}
}
