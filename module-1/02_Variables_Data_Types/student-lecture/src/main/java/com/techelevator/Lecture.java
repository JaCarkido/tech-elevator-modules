package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
			int numberOfExercises = 26;
		System.out.println("numberOfExercises is " + numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/

			double half = 0.5;
		System.out.println("half is " + half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
			
			String name = "Tech Elevator";
		System.out.println("name is " + name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		
			int seasonsOfFirefly = 1;
		System.out.println("seasonsOfFirefly = " + seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		
			String myFavoriteLanguage = "Java";
		System.out.println("myFavoriteLanguage is " +myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/

			double pi = 3.14;
		System.out.println("pi is " +pi);

		/*
		7. Create and set a variable that holds your name.
		*/
		
			String myName;  // only asked to create not initialize to be safe can assign null value String myName = "";
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

			int numberOfMouseButtons;
		
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/

			int percentPhoneBatteryRemaining;
			double percentPhoneBatteryRemaining2; // ask how they want it stored as a decimal or as whole number
			
		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/

			int difference = 121 - 27;
			
		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/

			double sumDouble = 12.3 + 32.1;
			
		/*
		12. Create a String that holds your full name.
		*/

			String myFullName = "James Alexander Carkido";
			
		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
			String helloName = "Hello, " + myFullName;
		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/

			String esquire = " Esquire";
				myFullName = myFullName + esquire;
			
		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

			myFullName += " esquire";
				
		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/

			String saw = "Saw " + 2; // will auto change 2 into a string
				
			
		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/

			saw = saw + "0";  // saw += 0;  will auto change 0 into a string
			
		/*
		18. What is 4.4 divided by 2.2?
		*/

			
			System.out.println( "4.4 divided by 2.2 is " + 4.4 / 2.2); //2.0
			
		/*
		19. What is 5.4 divided by 2?
		*/

			System.out.println( "5.4 divided by 2 is " +  5.4 / 2); //2.7
			
		/*
		20. What is 5 divided by 2?
		*/

			System.out.println( "5 divided by 2 is " + 5 / 2); // 2
			
		/*
		21. What is 5.0 divided by 2?
		*/

			System.out.println( "5.0 divided by 2 is " + 5.0 / 2); // 2.5
			
		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/

			System.out.println( "66.6 divided by 100 is " + 66.6 / 100); // .665999999999999
			
		/*
		23. If I divide 5 by 2, what's my remainder?
		*/

			System.out.println( "The remainder of 5 divided by 2 is " + 5 % 2); // 1  -- modulus can be used to determine odd/even, day of the week, leap year
																				// to determine how many times we have done something
		/*
		24. What is 1,000,000,000 * 3?
		*/

			System.out.println( "1,000,000,000 times 3 is " + 1000000000L * 3); // 3,000,000,000 
														// -1294967296  we exceeded max allowable value for an int (rolls over to 0)
													    //cannot have commas in the number
			
		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/

		boolean doneWithExercises = false;
			
		/*
		26. Now set doneWithExercise to true.
		*/
		
		doneWithExercises = true;
		
		/*
		27.) What happens when we divide by 0?
		 */
		 
		int num = 1 / 0; // we get a runtime exception. everything was coded okay but 
						 //when it ran there was something logically or mathematically incorrect so we stop the program
		
		// int num = 1.0 / 0;  returns Infinity 
		
	}

}
