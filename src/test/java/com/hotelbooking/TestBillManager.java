package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TestBillManager {
	/**
	 * test case to calculate the total bill amount
	 */
	@Test
	public void test1() {
		DisplayRoomManager.displayRoomTypes();
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-09 06:30";// Given endDate
		String roomChoice = "Mountain View";
		String acChoice = "Without AC";
		String foodChoice = "Without Food";
		String pickUpDropChoice = "Not interested in Transport option";
		ArrayList<String> list = new ArrayList<>
		(Arrays.asList(startDate, endDate, roomChoice, acChoice,foodChoice,pickUpDropChoice));
	    double totalAmount = BillManager.totalBill(list);
		assertEquals(2059750, totalAmount);
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
		ArrayList<String> list = new ArrayList<>
		(Arrays.asList(startDate, endDate, roomChoice, acChoice,foodChoice,pickUpDropChoice));
	    double totalAmount = BillManager.totalBill(list);
		assertEquals(1156926.8, totalAmount);
	}
}
