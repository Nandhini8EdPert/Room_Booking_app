package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHourCalculator {

	// To calculate the total hours spent in hotel
	@Test
	public void checkHourcalc() {
		String startDate = "2021-06-06 01:10";// Given startDate
		String endDate = "2021-06-06 06:30";// Given endDate
		float output = HourCalculator.findingHours(startDate, endDate);
		assertEquals(5, output);
	}
}
