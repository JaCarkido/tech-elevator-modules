package com.techelevator;

public class FruitTree {

// Class Data Members ------------------------------------------------------------------	
	
	String typeOfFruit = "";
	int piecesOfFruitLeft;
	
	
//Constructor -------------------------------------------------------------------------
	
public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
	this.typeOfFruit = typeOfFruit;
	this.piecesOfFruitLeft = startingPiecesOfFruit;
}

// Getters and Setters ----------------------------------------------------------------

/**
 * @return the typeOfFruit
 */
public String getTypeOfFruit() {
	return typeOfFruit;
}


/**
 * @return the piecesOfFruitLeft
 */
public int getPiecesOfFruitLeft() {
	return piecesOfFruitLeft;
}
	
	
//Methods -----------------------------------------------------------------------------

public boolean pickFruit(int numberOfPiecesToRemove) {
	if (piecesOfFruitLeft >= numberOfPiecesToRemove) {
		piecesOfFruitLeft -= numberOfPiecesToRemove;
		return true;
	} 

		
		return false;
	}
}
	



