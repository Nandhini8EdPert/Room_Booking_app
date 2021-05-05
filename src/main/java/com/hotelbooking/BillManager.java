package com.hotelbooking;

import java.util.ArrayList;

public class BillManager {
	/*
	 * calling the appropriate manager to calculate the total bill amount with user
	 * choice of input from test case.
	 */
	public static double totalBill(ArrayList<String> list) {
		// checking Check-In date is valid or not
		String startDate=list.get(0);
		DateTimeUtil.checkInDate(startDate);

		// checking Check-Out date is valid or not
		String endDate=list.get(1);
		DateTimeUtil.checkOutDate(startDate, endDate);

		// calculating total hours
		float totalHours = HourCalculator.findingHours(startDate, endDate);

		// calculating amount with choice of room selection
		String roomChoice=list.get(2);
		double roomCharge = RoomChoiceSelector.roomsPrice(roomChoice);

		// calculating amount with choice of AC/NON-AC
		String acChoice=list.get(3);
		double acCharge = FacilityChoiceSelector.acNonAcSelection(acChoice);

		// calculating amount with choice of with food / without food
		String foodChoice=list.get(4);
		double foodCharge = FacilityChoiceSelector.foodWithoutFoodSelection(foodChoice);

		// calculating amount with choice of Pick-Up and drop
		String pickUpDropChoice=list.get(5);
		double PickUpDropCharge = FacilityChoiceSelector.pickUpDropSelection(pickUpDropChoice);

		// getting all individual amount and adding together to get a bill
		double totalAmount = (acCharge * totalHours) + (roomCharge * totalHours) + (foodCharge * totalHours)
				+ PickUpDropCharge;

		// amount with 7% GST
		double amountWithGst = (totalAmount * 0.07) + totalAmount;

		// to avoid negative values
		double billAmount = Math.abs(amountWithGst);

		// printing the bill amount
		System.out.println("Total Amount is Rs." + billAmount);
		return billAmount;
	}
}
