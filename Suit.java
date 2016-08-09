import java.util.HashMap;

public class Suit {

	private String suit;
	private final int SPADES = 1;
	private final int HEARTS = 2;
	private final int DIAMONDS = 3;
	private final int CLUBS = 4;
	
	private static HashMap<String, Integer> suitList = new HashMap<String, Integer>(){{
		put("S", 1);
		put("C", 4);
		put("D", 3);
		put("H", 2);
	}};
	public Suit(){
		this.suit=null;
	}
	
	public Suit(String suit){
		this.suit = suit.toUpperCase();	
		
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit.toUpperCase();
	}
	
	public String toString(){
		return "Suit: " + this.getSuit();
	}
	
	public boolean isEqual(Suit suit2) {
		if(this.getSuit().equals(suit2.getSuit()))
			return true;
		else
			return false;
	}
	
	public boolean isGreater(Suit suite2) {
		if(suitList.get(this.getSuit()) > suitList.get(suite2.getSuit()))
			return true;
		else
			return false;
	}
	
}
