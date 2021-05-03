package com.hotelbooking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestRoomDisplayAndChoiceManager {
	/**
	 * Display rooms
	 */
	@Test
	public void Display() {
		DisplayRoomManager.displayRoomTypes();
	}

	/**
	 * Testing room choice with appropriate choice
	 */
	@Test
	public void roomChoice1() {
		String roomChoice = "Mountain View";
		double output = RoomChoiceSelector.roomsPrice(roomChoice);
		assertEquals(25000.0, output);
	}

	@Test
	public void roomChoice2() {
		String roomChoice = "Night Ocean View";
		double output = RoomChoiceSelector.roomsPrice(roomChoice);
		assertEquals(20000.0, output);
	}

	@Test
	public void roomChoice3() {
		String roomChoice = "Night City View";
		double output = RoomChoiceSelector.roomsPrice(roomChoice);
		assertEquals(15000.0, output);
	}

}
