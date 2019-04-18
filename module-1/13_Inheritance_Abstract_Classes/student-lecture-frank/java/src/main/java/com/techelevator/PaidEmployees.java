package com.techelevator;

public interface PaidEmployees {

		// if one implements this interface they must provide these methods 
	
	static final double taxRate = .10;
	
	public double calculateWeeklyPay(int numHoursWorked);
	
	public double calculateIncomeTax(double pay);
	
	
}
