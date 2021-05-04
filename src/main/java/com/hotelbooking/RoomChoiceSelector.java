package com.hotelbooking;

public class RoomChoiceSelector {
	/**
	 * displaying chosen room with amount
	 * 
	 * @param roomChoice
	 * @return roomAmount
	 */
	public static double roomsPrice(String roomChoice) {
		double roomAmount;
		if (roomChoice == "Mountain View" || roomChoice == "Night Ocean View" || roomChoice == "Night City View") {
			/* Get values based on key */
			roomAmount = DisplayRoomManager.roomAvailable.get(roomChoice);
			System.out.println("Amount for the room you've booked for " + roomChoice + "with Rs." + roomAmount);
		} else {
			throw new IllegalArgumentException("Invalid Option");
		}
		return roomAmount;
	}

}
