package com.techelevator;

<<<<<<< HEAD
import java.util.Scanner; // this includes the java code to support the scanner
=======
import java.util.Scanner;  // Include the Java code to support Scanner
>>>>>>> 45484b0294a1779a4441e4c8ad11622c3cac0001

public class Lecture {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		Scanner keyboard = new Scanner(System.in); //defines scanner object to access the keyboard
		
		int aNumber = 0; // a variable to hold the keyboard input
		
		String aLine = ""; //a variable to hold a line from the keyboard
		 
		System.out.println("Please enter a number.");
		aLine = keyboard.nextLine(); // get a line from a keyboard and put it into the variable : aLine

		aNumber = Integer.parseInt(aLine);
		aNumber++;
		
		System.out.println("The number you typed incremented is:  " + aNumber);
=======
		Scanner keyBoard = new Scanner(System.in);  // Define a Scanner object to access keyboard
		
		int aNumber = 0;   // variable to hold keyboard input
		int anotherNumber = 0;
		double pctg = 0.0;
		double result;
				
		String aLine = ""; // variable to hold a line from the keyboard
		
		System.out.println("Please enter a number");
		aLine = keyBoard.nextLine();         // get a line from keyboard and put it in variable aLine		
		aNumber = Integer.parseInt(aLine);   // convert a string to an integer
		
		System.out.println("Please enter another number");
		aLine = keyBoard.nextLine();               // get a line from keyboard and put it in variable aLine		
		anotherNumber = Integer.parseInt(aLine);   // convert a string to an integer
		
		System.out.println("Please enter a percentage as .nnnn");
		aLine = keyBoard.nextLine();               // get a line from keyboard and put it in variable aLine		
		pctg = Double.parseDouble(aLine);   // convert a string to an double
		
		aNumber += anotherNumber;
		result = aNumber *pctg;
		
		System.out.println("Sum is: " + aNumber);
		System.out.println("Pct is: " + result);

		/*
		 * The String solit() method may be used to divide a string into individual pieces based 
		 * on a delimiter/separator character passed to split.
		 * 
		 * The split method returns an array of Strings where each element is one of the pieces of the string.
		 * ****************************************************************************************************
		 * Example 1
		 * 
		 * String aString = "Bob, Carol, Ted, Alice";
		 * 
		 * String[] words = aString.split(",");  // Divide the string into pieces based on commas
		 * 
		 *                                   [0]     [1]    [2]     [3]    
		 * The words array would contain:  ------------------------------
		 *                                | Bob   | Carol | Ted   | Alice|
		 *                                 ------------------------------
		 *****************************************************************************************************
		 * Example 2
		 * 
		 * String phoneNum = "440-555-1234";
		 * 
		 * String[] phoneNumParts = phoneNum.split("-");
		 * 
		 *                                          [0]    [1]    [2]
		 * The phoneNumParts array would contain:  --------------------
		 *                                        | 440  | 555  | 1234 |
		 *                                         --------------------
		 * *****************************************************************************************************
		 * Example 3
		 * 
		 * String someNums = "100 34 27";
		 * 
		 * String[] someNumsParts = someNums.split(" ");
		 * 
		 *                                          [0]  [1]   [2]
		 * The SomeNumsParts array would contain:  ----------------
		 *                                        | 100 | 34  | 27 |
		 *                                         ----------------
		 * *****************************************************************************************************		 * 
		 */
		
		System.out.print("Please enter a series of integer values separated by spaces: ");
		aLine = keyBoard.nextLine();
		
		String[] theNums = aLine.split(" ");       // split the values into individual elements of a String array
		int[] nums = new int[theNums.length];      // define an int array to hold the String array elements converted to ints
		
		for (int i=0; i<theNums.length; i++) {     // Loop through String array one element at a time
			nums[i] = Integer.parseInt(theNums[i]);// Convert the current element in String array to an int and store in an int array
		}
		double sum = 0;                            // Variable to hold the sum of the numbers
		
		for (int i=0; i<nums.length;i++) {         // Loop through the array of ints
			sum += nums[i];                        // Add an int array element to sun
		}
		double avg = sum / nums.length;            // Calculate the average of the numbers	
		
		System.out.println("\nThe sum of your numbers is: " + sum);
		
		System.out.printf("The average of your number is: %.3f", avg);  // print avg with 3-decimal places
		
// We will talk about System.out.printf() in our next session
// if you want to know more about it before then, watch this video: https://www.youtube.com/watch?v=g_BsIuRVfvk  
>>>>>>> 45484b0294a1779a4441e4c8ad11622c3cac0001
	}

}

/*
Scanner input = new Scanner (system.in);
system.out.print("");
String value = input.nextLine();
int myVar = Interger.parseInt (value);
*/
