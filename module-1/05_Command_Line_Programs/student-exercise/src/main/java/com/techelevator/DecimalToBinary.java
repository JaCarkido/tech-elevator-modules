package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter a series of decimal values seperated by spaces:");
		
		
	//receives an input and stores the string in an array 
		String input = keyboard.nextLine(); //stores input from keyboard
		String[] userInput = input.split(" "); // store string split into an array
		//System.out.println("You entered: " + input); //testing input
		
	
	//For loop to store remainder in string [] binary, and divide by 2 and store to userNums[i] <--this loop only /2 once
		for (int i = 0;i < userInput.length; i++) {
			int decimalValue = Integer.parseInt(userInput[i]);
			String binaryString = new String("");

			for(; decimalValue > 0;) {  // decimal / 2 until it is 0
				binaryString = (decimalValue % 2) + binaryString;
				decimalValue = decimalValue / 2;
			
		
			}
			System.out.println(userInput[i] + " is " +binaryString + " in binary");
		
		
		

	}

}
}