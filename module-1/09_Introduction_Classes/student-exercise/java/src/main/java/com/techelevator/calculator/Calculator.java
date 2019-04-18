package com.techelevator.calculator;

public class Calculator {

//Class Data Members --------------------------------------------------------------------------------------------
	
	
private int currentValue = 0;


//Class Getters & Setters --------------------------------------------------------------------------------------------

/**
 * @return the currentValue
 */
public int getCurrentValue() {
	return currentValue;
}





//Class Methods --------------------------------------------------------------------------------------------

	public int add(int addend) {
		currentValue += addend;
		return currentValue;
	}

	public int multiply (int multiplier) {
		currentValue = currentValue * multiplier;
		return currentValue;
	}

	public int subtract(int subtrahend) {
		currentValue -= subtrahend;
		return currentValue;
	}

	public int power(int exponent) {
		//currentValue = (int) Math.pow(currentValue, exponent);  <---- i used a loop but found i could use the method Math.pow and cast an int onto it.
		int value = currentValue;
		for (int i = 1; i < exponent; i++) {
			currentValue = currentValue * value;
			
		}
		return currentValue;
	}

	public void reset() {
		currentValue = 0;
	}
	
}
