package com.hotelbooking;

public class FacilityChoiceSelector {
	/**
	 * to check AC selection is valid or not
	 * 
	 * @param acChoice
	 * @return acCharges
	 */
	public static double acNonAcSelection(String acChoice) {
		double acCharges;
		if (acChoice == "Without AC" || acChoice == "With AC") {
			acCharges = DisplayFacilityManager.acOption.get(acChoice);
			System.out.println("Amount for the room you've booked " + acChoice + " Rs." + acCharges);
		} else {
			throw new IllegalArgumentException("Invalid Choice");
		}
		return acCharges;
	}

	/**
	 * to check Food selection is valid or not
	 * 
	 * @param foodChoice
	 * @return foodCharges
	 */
	public static double foodWithoutFoodSelection(String foodChoice) {
		double foodCharges;
		if (foodChoice == "With Food" || foodChoice == "Without Food") {
			foodCharges = DisplayFacilityManager.foodOption.get(foodChoice);
			System.out.println("Amount for the room you've booked " + foodChoice + " Rs." + foodCharges);
		} else {
			throw new IllegalArgumentException("Invalid Choice");
		}
		return foodCharges;
	}

	/**
	 * to check Pick-Up and Drop selection is valid or not
	 * 
	 * @param pickUpDropChoice
	 * @return pickUpDropCharges
	 */
	public static double pickUpDropSelection(String pickUpDropChoice) {
		double pickUpDropCharges;
		if (pickUpDropChoice == "Not interested in Transport option" || pickUpDropChoice == "Need a Pik-Up and Drop") {
			pickUpDropCharges = DisplayFacilityManager.pickUpDropOption.get(pickUpDropChoice);
			System.out.println("Amount for the room you've booked " + pickUpDropChoice + " Rs." + pickUpDropCharges);
		} else {
			throw new IllegalArgumentException("Invalid Choice");
		}
		return pickUpDropCharges;
	}

}
