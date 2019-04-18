package com.techelevator;

public class Employee {
	
	//Class Data Members
	
	private int employeeId;
	private String firstName = "";
	private String lastName = "";
	private String fullName = "";
	private String department = "";
	private double annualSalary;
	
	
	//CTOR  
	
	
	public Employee (int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		annualSalary = salary;
		fullName = lastName + ", " + firstName;
	}
	
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastname the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	/**
	 * @return the employeeId
	 */
	public int getEmployeeId() {
		return employeeId;
	}
	/**
	 * @return the firtName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @return the annualSalery
	 */
	public double getAnnualSalary() {
		return annualSalary;
	}

	//Class Methods
	
	public void raiseSalary (double percent) {
		double percentAsDecimal = percent / 100;
		annualSalary = annualSalary * (1 + percentAsDecimal);
		
	}
	
}




