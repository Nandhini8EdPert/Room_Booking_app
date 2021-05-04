package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFacilityChoiceManager {
	/**
	 * test case for AC and NON-AC
	 */
	@Test
	public void withoutAc() {
		String acChoice = "Without AC";
		double output = FacilityChoiceSelector.acNonAcSelection(acChoice);
		assertEquals(0.0, output);
	}

	@Test
	public void withAc() {
		String acChoice = "With AC";
		double output = FacilityChoiceSelector.acNonAcSelection(acChoice);
		assertEquals(10.0, output);
	}

	/**
	 * test case for food and without food
	 */
	@Test
	public void withoutFood() {
		String foodChoice = "Without Food";
		double output = FacilityChoiceSelector.foodWithoutFoodSelection(foodChoice);
		assertEquals(0.0, output);
	}

	@Test
	public void withFood() {
		String foodChoice = "With Food";
		double output = FacilityChoiceSelector.foodWithoutFoodSelection(foodChoice);
		assertEquals(100.0, output);
	}

	/**
	 * test case for Pick-Up and Drop
	 */
	@Test
	public void withoutPickUpDrop() {
		String pickUpDropChoice = "Not interested in Transport option";
		double output = FacilityChoiceSelector.pickUpDropSelection(pickUpDropChoice);
		assertEquals(0.0, output);
	}

	@Test
	public void withPickUpDrop() {
		String pickUpDropChoice = "Need a Pik-Up and Drop";
		double output = FacilityChoiceSelector.pickUpDropSelection(pickUpDropChoice);
		assertEquals(700.0, output);
	}

	/**
	 * test cases for invalid AC option
	 */
	@Test
	public void invalidAcOption() {
		try {
			FacilityChoiceSelector.acNonAcSelection(" ");
			fail();
		} catch (Exception e) {
			assertEquals("Invalid Choice", e.getMessage());
		}
	}

	/**
	 * Test case for invalid Food Option
	 */
	@Test
	public void invalidFoodOption() {
		try {
			FacilityChoiceSelector.foodWithoutFoodSelection("");
			fail();
		} catch (Exception e) {
			assertEquals("Invalid Choice", e.getMessage());
		}
	}

	/**
	 * test case for invalid PickUpDrop Option
	 */
	@Test
	public void invalidPckUpDropOption() {
		try {
			FacilityChoiceSelector.pickUpDropSelection("");
			fail();
		} catch (Exception e) {
			assertEquals("Invalid Choice", e.getMessage());
		}
	}
}
