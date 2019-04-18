package com.techelevator.dog;

public class Dog {

// Class Data Members --------------------------------------------------------------------------------------------
	
private boolean sleeping;


// Class Getter & Setters --------------------------------------------------------------------------------------------

/**
 * @return the sleeping
 */
public boolean isSleeping() {
	return sleeping;
}

/**
 * @param sleeping the sleeping to set
 */
public void setSleeping(boolean sleeping) {
	this.sleeping = sleeping;
}


// Class Methods --------------------------------------------------------------------------------------------

public String makeSound() {
	if (sleeping == true) {
		return "Zzzzz...";
	}
	else {
		return "Woof!";
	}
	
}

public void sleep() {
	sleeping = true;
	
}

public void wakeUp() {
	sleeping = false;
	
}
	
}
