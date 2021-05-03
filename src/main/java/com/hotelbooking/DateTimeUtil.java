package com.hotelbooking;

import java.time.LocalDate;

public class DateTimeUtil {
	/**
	 * Checking checking date is valid or not
	 * 
	 * @param datestr
	 * @return String statement whether the date is before current date or today's
	 *         date or future date
	 */
	public static String checkInDate(String datestr) {
		String result;
		String in = datestr.substring(0, 10);
		LocalDate bdate = LocalDate.parse(in);
		if (bdate.isAfter(LocalDate.now())) { // TO CHECK THE DATE IS VALID OR NOT
			System.out.println("Good to go with Check-In date");
			result = "Good to go with Check-In date";
		} else if (bdate.isBefore(LocalDate.now())) {
			System.out.println("Can't book for past days");
			result = "Can't book for past days";
		} else {
			System.out.println("Prior booking is required");
			result = "Prior booking is required";
		}
		return result;
	}

	/**
	 * Checking Check-Out date
	 * 
	 * @param startDate
	 * @param endDate
	 * @return String statement whether the date is before the Check-In date or
	 *         check-In and check-Out date are same
	 */
	public static String checkOutDate(String startDate, String endDate) {
		String result;
		String in = startDate.substring(0, 10);
		String out = endDate.substring(0, 10);
		LocalDate inDate = LocalDate.parse(in);
		LocalDate outDate = LocalDate.parse(out);

		if (inDate.isAfter(outDate)) {
			System.out.println("Please check your Check Out date");
			result = "Please check your Check Out date";
		} else if (inDate.equals(outDate)) {
			System.out.println("You've booked for one day");
			result = "You've booked for today alone";
		} else {
			System.out.println("Good to go with In and Out date");
			result = "Good to go with In and Out date";
		}
		return result;
	}

}
