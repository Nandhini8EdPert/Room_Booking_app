package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestBillManager {
	/**
	 * test case to calculate the total bill amount
	 */
	@Test
	public void test1() {
		DisplayRoomManager.displayRoomTypes();
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-03 06:30";// Given endDate
		String roomChoice = "Mountain View";
		String acChoice = "Without AC";
		String foodChoice = "Without Food";
		String pickUpDropChoice = "Not interested in Transport option";
		double totalAmount = BillManager.totalBill(startDate, endDate, roomChoice, acChoice, foodChoice,
				pickUpDropChoice);
		assertEquals(1765500, totalAmount);
	}

	@Test
	public void test2() {
		DisplayRoomManager.displayRoomTypes();
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-08 07:30";// Given endDate
		String roomChoice = "Night Ocean View";
		String acChoice = "With AC";
		String foodChoice = "Without Food";
		String pickUpDropChoice = "Need a Pik-Up and Drop";
		double totalAmount = BillManager.totalBill(startDate, endDate, roomChoice, acChoice, foodChoice,
				pickUpDropChoice);
		assertEquals(1156926.8, totalAmount);
	}
}
