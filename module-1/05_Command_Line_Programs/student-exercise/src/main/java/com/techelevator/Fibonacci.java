package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		String input;
		int stopNumber;
		
		System.out.println("Please enter the Fibonacci number: ");
		input = keyboard.nextLine();
		stopNumber = Integer.parseInt(input);
		
		int fibonacci;
		int firstNum = 0;
		int secondNum = 1;
		
	
		
			for (int i = 0; i <= stopNumber; i++) {  //user input will > the number of iterations required to reach it. safe to use as placeholder.
				if(stopNumber <= firstNum) { // if statement validates that the loop can keep running. 
					// stopNumber = firstNum; // if fib number is passed it will terminate the loop.<-- resulted in infinite loop?
					break;
				}
				System.out.print(firstNum + " ");  // print before calculations 
				fibonacci = firstNum + secondNum; // holding container for new fib number
				firstNum = secondNum;  // changes first so that we can add the previous number to our new one
				secondNum = fibonacci; // sets new number from fib temp container
			}
	}		
}			



