package com.hotelbooking;

public class RoomChoiceSelector {
	/**
	 * displaying chosen room with amount
	 * 
	 * @param roomChoice
	 * @return roomAmount
	 */
	public static double roomsPrice(String roomChoice) {
		/* Get values based on key */
		double roomAmount = DisplayRoomManager.roomAvailable.get(roomChoice);
		System.out.println("Amount for the room you've booked for "+roomChoice + "with Rs." + roomAmount);
		return roomAmount;
	}

}
