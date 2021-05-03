package com.hotelbooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HourCalculator {
	/**
	 * calculating total hours of stay using try catch exception concept
	 * 
	 * @param startDate
	 * @param endDate
	 * @return long type true- if returns a total hours of stay in hotel false-
	 *         if throws exception
	 */
	public static float findingHours(String startDate, String endDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		float totalHour = 0;
		// Try Class
		try {
			Date d1 = sdf.parse(startDate);
			// System.out.println(d1);
			Date d2 = sdf.parse(endDate);
			long differenceInTime = d2.getTime() - d1.getTime();
			totalHour = differenceInTime / 3600000;
			System.out.println("Total Hours spent at Hotel: " + totalHour);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return totalHour;
	}
}
