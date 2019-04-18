package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;



public class KataFizzBuzzTest {

	//KataFizzBuzz testFizzBuzzCtor = new KataFizzBuzz(); I realized towards the end
		//that I could have just made one default object because we are not passing 
		//anything into the constructor
	
@Test
public void Return_Int_As_String() {
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("Int not properly converting to string", "1", test.fizzBuzz(1)) ;
}
@Test
public void Return_Multiples_Of_Three_As_Fizz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("multiples of 3 should return \"Fizz\" ","Fizz",test.fizzBuzz(9));
}

@Test
public void Return_Multiples_Of_Five_And_Three_As_FizzBuzz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("multiples of 3 and 5 should return \"FizzBuzz?\" ","FizzBuzz?",test.fizzBuzz(15));
}

@Test
public void Return_Multiples_Of_Five_As_Buzz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("Multiples of 5 should return \"Buzz\"","Buzz", test.fizzBuzz(20));
}

@Test
public void Test_Numbers_Bounds_1_To_100() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("boundry should be 1 to 100","", test.fizzBuzz(101));
	assertEquals("boundry should be 1 to 100","", test.fizzBuzz(0));
	
}
@Test 
public void Test_Contains_3_Equals_Fizz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("if string contains 3, return \"Fizz\"","Fizz", test.fizzBuzz(34));
	assertEquals("if string contains 3, return \"Fizz\"","Fizz", test.fizzBuzz(23));
}
@Test
public void Test_Contains_5_Equals_Buzz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("if string contains 5, return \"Buzz\"","Buzz", test.fizzBuzz(57));
	
}

@Test
public void Test_Contains_5_And_3_Equals_FizzBuzz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("if string contains 5, return \"Buzz\"","FizzBuzz?", test.fizzBuzz(35));
	assertEquals("if string contains 5, return \"Buzz\"","FizzBuzz?", test.fizzBuzz(53));
	
}
/*      ------I don't think this is an actual requirement--------
@Test
public void Test_Contains_3_And_5_Equals_FizzBuzz() {
	
	KataFizzBuzz test = new KataFizzBuzz();
	assertEquals("if string contains 3 and 5, return \"FizzBuzz?\"","FizzBuzz?",test.fizzBuzz(53));
	assertEquals("if string contains 3 and 5, return \"FizzBuzz?\"", "FizzBuzz?", test.fizzBuzz(35));
}
*/


}


/*
Steps
	1.) does an integer convert to a string



*/