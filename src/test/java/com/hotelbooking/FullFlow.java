package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FullFlow {

	@Test
	void test() {
		long mobileNo = 9876543299L;
		String pwd = "12345678";
		UserManager.addUser(mobileNo, pwd);
		String mobOutput = UserValidationManager.mobileNumberCheck(mobileNo);
		assertEquals("Valid Mobile Number", mobOutput);
		String pwdOutput = UserValidationManager.userpassword(pwd);
		assertEquals("Valid Password", pwdOutput);
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
	void errorTest() {
		long mobileNo = 98765431L;
		String pwd = "123478";
		try {
			UserValidationManager.mobileNumberCheck(mobileNo);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Mobile Number", e.getMessage());
		}
		try {
			UserValidationManager.userpassword(pwd);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Password", e.getMessage());
		}
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
