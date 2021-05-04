package com.hotelbooking;

import java.time.YearMonth;

public class PaymentCardValidation {

	/**
	 * to check the card validity
	 * 
	 * @param cardex
	 * @return boolean
	 */
	public static String creditcardValidyear(String cardex) {
		YearMonth cardexpirydate = YearMonth.parse(cardex);
		YearMonth now = YearMonth.now();
		if (cardexpirydate.isBefore(now)) {
			throw new IllegalArgumentException("Invalid Card Expiry Year");
		}
		return "Valid Expiry Year";
	}

	/**
	 * to check card number's length
	 * 
	 * @param CardNumber
	 * @return
	 */
	public static String cardNumberLength(String CardNumber) {
		String cardNumberTrim = CardNumber.trim();
		System.out.println("Length of Card Number: " + cardNumberTrim.length());
		if (cardNumberTrim.length() != 16)// TO CHECK THE LENGTH OF A STRING
		{
			throw new IllegalArgumentException("Invalid Card Number");
		}
		return "Valid Card Number";
	}

}
