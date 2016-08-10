package com.bootcamp.playingcards;

public class Card {

	private Rank rank;
	private Suit suit;
	
	public Card(){
		this.rank = null;
		this.suit = null;		
	}
	
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
		
	}
	
	public Card(String rank, String suit){
		this.rank = new Rank(rank.toUpperCase());
		this.suit = new Suit(suit.toUpperCase());		
	}
	
	public Card(String card){
		if(card.length() == 2){
			this.rank = new Rank(card.toUpperCase().charAt(0) + "");
			this.suit = new Suit(card.toUpperCase().charAt(1) + "");
		}
		else{
			this.rank = new Rank(card.toUpperCase().substring(0, 1));
			this.suit = new Suit(card.toUpperCase().charAt(2) + "");	
		}
		
	}
	
	public Rank getCardRank() {
		return rank;
	}

	public void setCardRank(Rank rank) {
		this.rank = rank;
	}

	public Suit getCardSuit() {
		return suit;
	}

	public void setCardSuit(Suit suit) {
		this.suit = suit;
	}


	public String toString() {
		return "Card: " + rank.toString() + "of" + suit.toString();
	}
	
	public boolean isCardGreater(Card card){
		if(this.getCardRank().isGreater(card.getCardRank()))
			return true;
		else if(this.getCardRank().isEqual(card.getCardRank()))
				return (this.getCardSuit().isGreater(card.getCardSuit()))? true : false;
		else
			return false;
	}

	
}
