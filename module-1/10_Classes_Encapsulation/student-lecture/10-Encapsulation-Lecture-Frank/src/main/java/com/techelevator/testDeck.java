package com.techelevator;

public class testDeck {

	public static void main(String[] args) {
		
		CardDeck.howManyDecks();
		
		CardDeck aDeck = new CardDeck();  // Instantiate a CardDeck object
		
		//System.out.println("# of cards in deck: " + aDeck.size()); 
		
		aDeck.howManyDecks();
		
		//aDeck.ShowDeck();
		
		aDeck.shuffle();
		
		CardDeck aDeck2 = new CardDeck();
		
		aDeck.howManyDecks();
		
		CardDeck aDeck3 = new CardDeck();
		
		aDeck.howManyDecks();

		
	}

}
