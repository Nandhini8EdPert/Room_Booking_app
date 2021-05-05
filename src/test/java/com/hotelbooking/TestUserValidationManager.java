package com.hotelbooking;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TestUserValidationManager {
	/**
	 * add the valid user and password check their User Id(mobile Number) and
	 * password
	 */
	@Test
	public void addingUserAndValidatingValidInput() {
		long mobileNo = 9876543299L;
		String pwd = "12345678";
		UserManager.addUser(mobileNo, pwd);
		String mobOutput = UserValidationManager.mobileNumberCheck(mobileNo);
		assertEquals("Valid Mobile Number", mobOutput);
		String pwdOutput = UserValidationManager.userpassword(pwd);
		assertEquals("Valid Password", pwdOutput);
	}

	/**
	 * display the user present
	 */
	@Test
	public void displayUserMobNo() {
		UserManager.displayUserwithPassword();
	}

	/**
	 * add the invalid user and password check their User Id(mobile Number) and
	 * password then remove the user
	 */
	@Test
	public void addingUserAndValidatingInvalidInput() {
		long mobileNo = 98765431L;
		String pwd = "123478";
		try {
			UserValidationManager.mobileNumberCheck(mobileNo);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Mobile Number", e.getMessage());
		}
		try {
			UserValidationManager.userpassword("1234");
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Password", e.getMessage());
		}

	}

	/**
	 * to check whether the particular user exists
	 */
	@Test
	public void userExists() {
		boolean output = UserManager.doesUserExists(9876543213L);
		assertTrue(output == true);
	}

	/**
	 * to check whether it gives false for other than registered user
	 */
	@Test
	public void noSuchUser() {
		boolean output = UserManager.doesUserExists(9876643212L);
		assertTrue(output == false);
	}

	/**
	 * to get particular user info if required
	 */
	@Test
	public void getUserDetail() {
		UserManager.displayParticularUserDetails(9876543222L);
	}

}
