package Hand

Class Hand{
			ArrayList<Card> cards;
			int handMax=0;
			public Hand(int limit){
					cards = new ArrayList<Card>();
					handMax = limit;
			}
			public Hand(ArrayList<Cards> c){
				this.cards = c;
			}
			public Hand(String list){
				String[] cardList = list.split(" ");
				for(String s:cardList){
					this.cards.add(new Card(s));
				}
			}
			public void addCard(Card c){
				this.cards.add(c);
			}
			public void addCard(String card){
				if(cards.size() > handMax)
					this.cards.add(new Card(card));
			}
			public ArrayList<Card> getCards(){
				return this.cards;
			}
			public @Override String toString(){
					String hand = "";
					for(Card c:cards)
						hand += c.toString() + " ";
					return hand;
			}
			public static void main(String args[]){
				System.out.println("Hi")
			}
			
}