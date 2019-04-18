package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
	
	private static int numberOfDecks = 0;
	
	
	private List<PlayingCard> deck = new ArrayList<PlayingCard>();
	//int numberOfDecks = 0;   // this is an instance variable - one copy for each instance of an object. ie each deck gets 1
	
	public CardDeck() {
		
		for (int value = 1; value <= 13; value++) {
			for (String suit : new String[] {"Clubs", "Spades", "Hearts", "Diamonds"}) {
				deck.add(new PlayingCard(suit, value));
			}
		}	
		numberOfDecks ++;  // count the new deck
	}
	public void ShowDeck() {
		System.out.println("Number of cards in deck: " + deck.size() + "\n");
		for(PlayingCard aCard : deck) {
			System.out.println(aCard);
		}
		
	}
	
	public int size() {
		return deck.size();
	
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	
	}
	
// static method allows the method to run without an object	
	public static void howManyDecks() {
		System.out.println("The number of Decks is: " + numberOfDecks);
	}
	
}


