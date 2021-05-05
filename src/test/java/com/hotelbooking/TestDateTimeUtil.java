package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDateTimeUtil {
	/**
	 * Test case to check the Check-In date is valid or not
	 */
	@Test
	public void testCheckInPastDays() {
		String bdate = "2021-03-04";
		String Output = DateTimeUtil.checkInDate(bdate);
		assertEquals("Can't book for past days", Output);
	}

	@Test
	public void testchekIntoDay() {
		String bdate = "2021-05-05";
		String Output = DateTimeUtil.checkInDate(bdate);
		assertEquals("Prior booking is required", Output);
	}

	@Test
	public void testcheckInfutureDays() {
		String bdate = "2021-06-07";
		String Output = DateTimeUtil.checkInDate(bdate);
		assertEquals("Good to go with Check-In date", Output);
	}

	/**
	 * to compare the Check-Out date with Check-In date
	 */
	@Test
	public void checkOuttodays() {
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-06 06:30";// Given endDate
		String output = DateTimeUtil.checkOutDate(startDate, endDate);
		assertEquals("You've booked for today alone", output);
	}

	@Test
	public void checkOutfuturedays() {
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-07 06:30";// Given endDate
		String output = DateTimeUtil.checkOutDate(startDate, endDate);
		assertEquals("Good to go with In and Out date", output);
	}

	@Test
	public void checkOutpastdays() {
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-03 06:30";// Given endDate
		String output = DateTimeUtil.checkOutDate(startDate, endDate);
		assertEquals("Please check your Check Out date", output);
		
	}
	
}