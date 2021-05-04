package com.hotelbooking;

import org.junit.jupiter.api.Test;

class TestFacilityDisplayManager {
	/**
	 * to display the facility available in hotel
	 */
	@Test
	public void foodOptionsDisplay() {
		DisplayFacilityManager.displayfoodNofood();
	}

	@Test
	public void acOptionsDisplay() {
		DisplayFacilityManager.displayAcOption();
	}

	@Test
	public void pickUpDropOptionDisplay() {
		DisplayFacilityManager.pickUpDropDisplay();
	}

}
