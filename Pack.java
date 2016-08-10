package com.bootcamp.playingcards;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.EnumSet;

class Pack {
	private ArrayList<Card> cards = new ArrayList<Card>();
	private final int PACK_SIZE = 52;
	EnumSet<Constants> suitNames = EnumSet.of(Constants.SPADE, Constants.CLUB, Constants.HEARTS, Constants.DIAMONDS);
	EnumSet<Constants> ranksNames = EnumSet.of(Constants.TWO, Constants.THREE, Constants.FOUR, Constants.FIVE, Constants.SIX, Constants.SEVEN, Constants.EIGHT,
			Constants.NINE, Constants.TEN, Constants.JACK, Constants.QUEEN, Constants.KING, Constants.ACE);

	public Pack() {
		for(Constants suit : suitNames) {
			for(Constants rank: rankNames) {
				Card newCard = new Card(rank,suit);
				this.cards.add(newCard);
			}
		}
	}
}