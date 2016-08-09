// getHand() in Class Deck should return Hand.
// isBetterRummyHand() in Class Hand should compare two Hands.

import java.util.ArrayList;

public class RummyHandEvaluator {
	
	private Deck deck;
	private ArrayList<Hand> handArray = new ArrayList<Hand>();
	
	public RummyHandEvaluator(int noOfPlayers, int noOfCards){
		
		this.deck = new Deck(1);

		while(noOfPlayers > 0){
			handArray.add(deck.getHand(noOfCards));
			noOfPlayers --;
		}
	}	
	
	public String findBestHand(){
		
		Hand bestHand = handArray.get(0);
		for(Hand h: handArray){
			if(h.isBetterRummyHand(bestHand))
				bestHand = h;			
		}		
		return bestHand.toString();
	}
}
	
