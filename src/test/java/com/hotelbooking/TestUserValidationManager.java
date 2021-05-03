package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TestUserValidationManager {
	/**
	 * testing whether the mobile number is valid or not
	 */
	@Test
	public void forvalidMobileNo() {
		long mobileNo = 9876543211L;
		UserManager.addUser(mobileNo);
		String output = UserValidationManager.mobileNumberCheck(mobileNo);
		assertEquals("Valid Mobile Number", output);
	}

	@Test
	public void displayUserMobNo() {
		UserManager.displayUser();
	}

	@Test
	public void forIvalidMobileNo() {
		try {
			long mobileNo = 0076543211L;
			UserManager.addUser(0076543211L);
			UserValidationManager.mobileNumberCheck(mobileNo);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Mobile Number", e.getMessage());
		}

	}

	/**
	 * checking whether the password is valid or not
	 */
	@Test
	public void validPassword() {
		String output = UserValidationManager.userpassword("12345678");
		assertEquals("Valid Password", output);
	}

	@Test
	public void inValidPassword() {
		try {
			UserValidationManager.userpassword("1234");
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Password", e.getMessage());
		}

	}

}
