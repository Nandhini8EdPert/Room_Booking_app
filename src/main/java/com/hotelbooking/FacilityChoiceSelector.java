package com.hotelbooking;

public class FacilityChoiceSelector {
	public static double acNonAcSelection(String acChoice) {
		double acCharges = DisplayFacilityManager.acOption.get(acChoice);
		System.out.println("Amount for the room you've booked "+acChoice + " Rs." + acCharges);
		return acCharges;
	}
	
	public static double foodWithoutFoodSelection(String foodChoice) {
		double foodCharges = DisplayFacilityManager.foodOption.get(foodChoice);
		System.out.println("Amount for the room you've booked "+foodChoice + " Rs." + foodCharges);
		return foodCharges;
	}
	
	public static double pickUpDropSelection(String pickUpDropChoice) {
		double pickUpDropCharges = DisplayFacilityManager.pickUpDropOption.get(pickUpDropChoice);
		System.out.println("Amount for the room you've booked "+pickUpDropChoice + " Rs." + pickUpDropCharges);
		return pickUpDropCharges;
	}
	
}
