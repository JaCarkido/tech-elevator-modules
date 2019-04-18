package com.techelevator;

public class Airplane {

//class data members
	
	private String planeNumber;
	//First Class
	private int bookedFirstClassSeats;
	//private int availableFirstClassSeats; // derived
	private int totalFirstClassSeats;
	//Coach
	private int bookedCoachSeats;
	//private int availableCoachSeats; // derived
	private int totalCoachSeats;
	
//Class CTOR

	
public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
	this.planeNumber = planeNumber;
	this.totalFirstClassSeats = totalFirstClassSeats;
	this.totalCoachSeats = totalCoachSeats;
	
	
}
	
	
	
	
//class getters and setters
	/**
	 * @return the planeNumber
	 */
	public String getPlaneNumber() {
		return planeNumber;
	}
	/**
	 * @return the bookedFirstClassSeats
	 */
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	/**
	 * @return the availableFirstClassSeats
	 */
	public int getAvailableFirstClassSeats() {

		return totalFirstClassSeats - bookedFirstClassSeats;
	}
	/**
	 * @return the totalFirstClassSeats
	 */
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	/**
	 * @return the bookedCoachSeats
	 */
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}
	/**
	 * @return the availableCoachSeats
	 */
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}
	/**
	 * @return the totalCoachSeats
	 */
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	// class methods
	
	public boolean reserveSeats(boolean forFirstClass, int numberOfSeats) {
		
		if (forFirstClass) {
			if( numberOfSeats > getAvailableFirstClassSeats()) {
				
				return false;
			}
			bookedFirstClassSeats += numberOfSeats;
				
		}
			
		
		
		// !forFirstClass
		else {
			if(numberOfSeats > getAvailableCoachSeats()) {
				return false;
			}
				bookedCoachSeats += numberOfSeats;
			
		}
		
		return true;
		
	}
}
