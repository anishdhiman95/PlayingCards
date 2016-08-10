package com.bootcamp;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;

class Deck {
	private ArrayList<Card> cards;
	private int deckSize;
	private int cardsLeft;
	private Random randomGenerator = new Random<>();
	
	public Deck(int num) {
		this.deckSize = num;
		this.cardsLeft = this.deckSize;
	}
	
	public Card getCard() {
		// Returns a random card from the deck
		int index = this.randomGenerator(this.cardsLeft);
		Card randomCard = this.cards(index)
		this.cards.remove(index);
		this.cardsLeft--;
		return randomCard;
	}
	
	public Hand getHand(int cardsNum) {
		// Returns a list of random cards from the array list
		Hand newHand = new Hand(cardsNum);
		for ( int ctr = 1 ; ctr <= cardsNum ; ctr++ ) {
			newHand.addCard(this.getCard());
		}
		return newHand;
	}
	
	public void addPack(Pack pack) {
		// Add a pack to the Deck
		f
		
	}
	public int getRemainingCards() {
		return this.cardsLeft;
	}
}
