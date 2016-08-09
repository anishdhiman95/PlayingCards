public class Card {

	private Rank rank;
	private Suite suite;
	
	public Card(){
		this.rank = null;
		this.suite = null;		
	}
	
	public Card(Rank rank, Suite suite){
		this.rank = rank;
		this.suite = suite;
		
	}
	
	public Card(String rank, String suite){
		this.rank = new Rank(rank.toUpperCase());
		this.suite = new Suite(suite.toUpperCase());		
	}
	
	public Card(String card){
		if(card.length() == 2){
			this.rank = new Rank(card.toUpperCase().charAt(0) + "");
			this.suite = new Suite(card.toUpperCase().charAt(1) + "");
		}
		else{
			this.rank = new Rank(card.toUpperCase().substring(0, 1));
			this.suite = new Suite(card.toUpperCase().charAt(2) + "");	
		}
		
	}
	
	public Rank getCardRank() {
		return rank;
	}

	public void setCardRank(Rank rank) {
		this.rank = rank;
	}

	public Suite getCardSuite() {
		return suite;
	}

	public void setCardSuite(Suite suite) {
		this.suite = suite;
	}


	public String toString() {
		return "Card: " + rank.toString() + "of" + suite.toString();
	}
	
	public boolean isCardGreater(Card card){
		if(this.getCardRank().isGreater(card.getCardRank()))
			return true;
		else if(this.getCardRank().isEqual(card.getCardRank()))
				return (this.getCardSuite().isGreater(card.getCardSuite()))? true : false;
		else
			return false;
	}

	
}
