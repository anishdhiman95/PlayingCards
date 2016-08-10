import java.util.HashMap;

public class Suit {

	private String suit;
	
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
		return this.getSuit();
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
	
	public int getValue(){
		return suitList.get(this.suit);
	}
	
}
