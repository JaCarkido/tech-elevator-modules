package com.techelevator.farm;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!");
	}
@Override
	public String getSound() {
		
	return "Hi, I'm a Cow and I say " + super.getSound();      // need to use superclass method because sound is private in the superclass
								  // return sound = the field FarmAnimal.sound is not visible 
	
	}
	
}