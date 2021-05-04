package com.hotelbooking;

public class UserValidationManager {
	/**
	 * getting password and checking whether it is valid or not
	 * 
	 * @param pwd
	 * @return String
	 */
	public static String userpassword(String pwd) {
		if (pwd.length() != 8)// TO CHECK THE LENGTH OF A STRING
		{
			throw new IllegalArgumentException("Invalid Password");
		}
		return "Valid Password";
	}

	/**
	 * checking mobile number whether it is valid or not
	 * 
	 * @param mobNo
	 * @return String
	 */
	public static String mobileNumberCheck(long mobNo) {
		String ph = String.valueOf(mobNo);
		if (ph.length() != 10 || mobNo / 1000000000 == 0) {
			throw new IllegalArgumentException("Invalid Mobile Number");
		}
		return "Valid Mobile Number";
	}

}
