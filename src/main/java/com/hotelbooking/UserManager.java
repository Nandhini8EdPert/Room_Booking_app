package com.hotelbooking;

import java.util.HashSet;

public class UserManager {

	static HashSet<Long> mobileNo = new HashSet<Long>();

	static {

		mobileNo.add(9876543213L);
		mobileNo.add(9876543222L);
		mobileNo.add(9876543211L);
	}

	/**
	 * Adding User ID as Mobile Number
	 * 
	 * @param mobNo
	 */
	public static void addUser(long mobNo) {

		mobileNo.add(mobNo);
		System.out.println("Successfully added the User");
	}

	/**
	 * displaying User mobile number
	 */
	public static void displayUser() {
		for (long phoneNo : mobileNo) {
			System.out.println(phoneNo);
		}
	}

}
