package com.techelevator;

public final class SalaryWorker extends Worker {  //final says this class cannot be inherited
	
	//****************************************************************************************
	// Data members / Instance Data
	//****************************************************************************************
	
	double annualSalary;
	
	//****************************************************************************************
	// Getters and Setters
	//****************************************************************************************	
	/**
	 * @return the annualSalary
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	//****************************************************************************************
	// member functions
	//****************************************************************************************

	public SalaryWorker(String firstName, String lastName, double pay) {
		super(firstName, lastName);
		annualSalary = pay;
	}
	
	
	@Override		
	public double calculateWeeklyPay(int numHoursWorked) {
		return annualSalary / 52;
	}

	@Override
	public double calculateIncomeTax(double pay) {
		return pay * taxRate;
	}
	
}
