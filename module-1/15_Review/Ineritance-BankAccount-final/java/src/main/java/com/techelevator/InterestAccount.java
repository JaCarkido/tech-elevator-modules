package com.techelevator;

public interface InterestAccount {

	// an interface requires anyone who implements it to create methods() defined in the interface
	// only data an interface can have is final static
	
	final static double INTEREST_RATE = .02; // constant interest rate of 2%
	
	public DollarAmount addInterest ();
	
	
	
}
