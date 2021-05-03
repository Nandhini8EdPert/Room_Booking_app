package com.hotelbooking;

import org.junit.jupiter.api.Test;

class TestFacilityDisplayManager {

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
