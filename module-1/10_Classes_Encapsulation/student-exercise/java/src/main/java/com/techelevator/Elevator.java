package com.techelevator;

public class Elevator {
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean openDoor;
	
	
	
//CTOR
	
	public Elevator(int totalNumberOfFloors){
		this.numberOfFloors = totalNumberOfFloors;
		currentFloor = 1;
		
	}
	
	
	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}
	/**
	 * @return the numberOfFloors
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}
	/**
	 * @return the openDoor
	 */
	public boolean isDoorOpen() {
		return openDoor;
	}
	
//methods
	
	public void openDoor() {
		openDoor = true;
	}

	public void closeDoor() {
		openDoor = false;
	}
	
	public void goUp(int desiredFloor) {
		if(!openDoor && desiredFloor > currentFloor && desiredFloor <= numberOfFloors) {
			//openDoor;   should i open when we arive at their floor?
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if(!openDoor && desiredFloor >= 1 && desiredFloor < currentFloor) {
			currentFloor = desiredFloor;
		
		}
	}
}
