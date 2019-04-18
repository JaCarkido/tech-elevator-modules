package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner (System.in);
		
		String input = "";
		double distance = 0;
		
		System.out.println("Please enter a length");
		input = keyboard.nextLine();
		distance = Double.parseDouble(input);
		
		String unitIs = "";
		
		System.out.println("Is the measurement in [m]eters, or [f]eet?");
		unitIs = keyboard.nextLine();
		
		double convertedLength = 0;
		
			if(unitIs.equalsIgnoreCase("m")) {
				convertedLength = distance * 3.2808399;
				System.out.printf("%.2fm is %.2f ft",distance, convertedLength );
			}else {				
		convertedLength = distance * 0.3048;
		System.out.printf("%.2f ft is %.2f m",distance, convertedLength );
				
			}			
		
	}

}
