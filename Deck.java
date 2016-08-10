import java.util.ArrayList;
import java.util.Random;

class Deck {
	private ArrayList<Card> cards;
	private int deckSize;
	private int cardsLeft;
	private Random randomGenerator = new Random();
	
	public Deck(int num) {
		this.deckSize = num;
		this.cardsLeft = this.deckSize;
	}
	
	public Card getCard() {
		int index = this.randomGenerator.nextInt(this.cardsLeft);
		Card randomCard = this.cards.get(index);
		this.cards.remove(index);
		this.cardsLeft--;
		return randomCard;
	}
	
	public Hand getHand(int cardsNum) {
		Hand newHand = new Hand(cardsNum);
		for ( int ctr = 1 ; ctr <= cardsNum ; ctr++ ) {
			newHand.addCard(this.getCard());
		}
		return newHand;
	}
	
	public void addPack(Pack pack) {
		// Add a pack to the Deck
		
	}
	public int getRemainingCards() {
		return this.cardsLeft;
	}
}
