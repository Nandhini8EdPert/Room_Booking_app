package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestPaymentCardValidation {

	// to check card number length whether its 16 or not
	@Test
	public void cardNumberLengthCheck() {
		String cardNo = " 8765343312345678 ";
		String output = PaymentCardValidation.cardNumberLength(cardNo);
		assertEquals("Valid Card Number", output);
	}

	@Test
	public void cardNumberLengthInvalid() {
		try {
			String cardNo = "87655678";
			PaymentCardValidation.cardNumberLength(cardNo);
			fail();
		}catch(IllegalArgumentException e) {
			assertEquals("Invalid Card Number",e.getMessage());
		}
	}

	// to check card validity year and month
	@Test
	public void cardValid() {
		String cardNo = "2021-09";
		String output = PaymentCardValidation.creditcardValidyear(cardNo);
		assertEquals("Valid Expiry Year", output);
	}

	@Test
	public void cardInvalid() {
		try {
		String cardNo = "2021-02";
		PaymentCardValidation.creditcardValidyear(cardNo);
		fail();
		}catch(IllegalArgumentException e) {
		assertEquals("Invalid Card Expiry Year", e.getMessage());
		}
	}

}
