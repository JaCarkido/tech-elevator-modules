package com.techelevator.company;

public class Company {
	
//Class Data Members --------------------------------
	
 private String name;
 private int numberOfEmployees;
 private double revenue;
 private double expenses;
 
 

//Class Get & Set -----------------------------------

 
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the numberOfEmployees
 */
public int getNumberOfEmployees() {
	return numberOfEmployees;
}
/**
 * @param numberOfEmployees the numberOfEmployees to set
 */
public void setNumberOfEmployees(int numberOfEmployees) {
	this.numberOfEmployees = numberOfEmployees;
}
/**
 * @return the revenue
 */
public double getRevenue() {
	return revenue;
}
/**
 * @param revenue the revenue to set
 */
public void setRevenue(double revenue) {
	this.revenue = revenue;
}
/**
 * @return the expenses
 */
public double getExpenses() {
	return expenses;
}
/**
 * @param expenses the expenses to set
 */
public void setExpenses(double expenses) {
	this.expenses = expenses;
}

// Class Methods -------------------------------------

public String getCompanySize() {
	if(numberOfEmployees <= 50) {
		return "small";
	}
	else {
		if(numberOfEmployees >= 51 && numberOfEmployees <= 250) {
			return "medium";
		}
		else {
			return "large";
		}
	}
}


public double getProfit() {
	return (revenue - expenses);
	
}



 
}
