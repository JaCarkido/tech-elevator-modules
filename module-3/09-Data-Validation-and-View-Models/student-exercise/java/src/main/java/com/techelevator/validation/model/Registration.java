package com.techelevator.validation.model;

import java.time.LocalDate;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Registration {
	

	@NotBlank(message="First name is required")
	private String firstName;
	
	@NotBlank(message="Last name is required")
	private String lastName;
	
	@NotBlank(message="Email address is required")
	@Email(message="Email must be a valid email address") //checks valid email format not valid email address
	private String email;
	
	@NotBlank(message="Verify email address is required")
	private String verifyEmail;
	
	@Pattern(regexp="^\\d{2}\\/\\d{2}\\/\\d{4}$", message="Please enter a valid, date")      //    dd/dd/dddd
	private String birthday;
	
	@NotBlank(message="Password is required")
	private String password;
	
	@NotBlank(message="Verify email address is required")
	private String verifyPassword;
	
	@SuppressWarnings("unused")
	private boolean passwordMatching; 
	@AssertTrue(message="Passwords must match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(verifyPassword);
		} else {
			return false;
		}
	}
	
	@SuppressWarnings("unused")
	private boolean emailMatching; 
	@AssertTrue(message="Emails must match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(verifyEmail);
		} else {
			return false;
		}
	}
	
	
	@Min(value=1, message="You must have at least 1 Ticket")
	@Max(value=10, message="You cannot have more than 10 Tickets")
	private Integer numberOfTickets;
	
	

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getVerifyPassword() {
		return verifyEmail;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setPhone(String birthday) {
		this.birthday = birthday;
	}

	public Integer getNumberOfTickets() {
		return numberOfTickets;
	}

	public void setNumberOfTickets(Integer numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}

}
