package com.hotelbooking;

import java.util.HashMap;

public class UserManager {
	/**
	 * User's List
	 */
	public static HashMap<Long, String> userDetails = new HashMap<Long, String>();
	static {
		userDetails.put(9876543213L, "12345678");
		userDetails.put(9876543222L, "12345578");
		userDetails.put(9876543211L, "12245678");
	}

	/**
	 * Adding User ID as Mobile Number and password as 8-character String
	 * 
	 * @param mobNo
	 */
	public static void addUser(long mobNo, String pwd) {
		userDetails.put(mobNo, pwd);
		System.out.println("Successfully added the User");
	}

	/**
	 * displaying User mobile number along with password
	 */
	public static void displayUserwithPassword() {
		System.out.println("/*** User Details ***/");
		for (Long userMobNo : UserManager.userDetails.keySet()) {
			String pwd = UserManager.userDetails.get(userMobNo);
			System.out.println("User Mobile Number --> " + userMobNo + ", Password --> " + pwd);
		}
	}

	/**
	 * to get particular user detail
	 * 
	 * @param mobNo
	 */
	public static void displayParticularUserDetails(long mobNo) {
		String pwd = UserManager.userDetails.get(mobNo);
		System.out.println("User Mobile Number --> " + mobNo + ", Password --> " + pwd);
		System.out.println("Total Users:" + UserManager.userDetails.size());
	}

	/**
	 * To check whether the mobile number exists or not
	 * 
	 * @param mobNo
	 * @return boolean
	 */
	public static boolean doesUserExists(long mobNo) {
		boolean output = userDetails.containsKey(mobNo);
		if (output == true) {
			System.out.println("The User Mobile Number Exists ");
		} else {
			System.out.println("The user does'nt exists");
		}
		return output;
	}

	/**
	 * To delete the particular user along with their password
	 * 
	 * @param mobNo
	 */
	public static void deleteUser(long mobNo) {
		UserManager.userDetails.remove(mobNo);
		System.out.println("User is deleted");
		displayUserwithPassword();
	}

}
