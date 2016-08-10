import java.util.ArrayList;

public class Hand{
			ArrayList<Card> cards;
			int handMax=0;
			public Hand(int limit){
					cards = new ArrayList<Card>();
					handMax = limit;
			}
			public Hand(ArrayList<Card> c){
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
			public String toString(){
					String hand = "";
					for(Card c:cards)
						hand += c.toString() + " ";
					return hand;
			}
			
		
			public void sort(){
			ArrayList<Card> temp = new ArrayList<Card>();
			
			Card min;
			for(int i = 0; i < cards.size() - 1 ; i++){
				min = cards.get(i);
				for(int j = i + 1; j < cards.size(); j++){
					if(!cards.get(j).isCardGreater(min)){
						min = cards.get(j);
					}
				temp.add(min);
				
				}
			}
			cards= (ArrayList<Card>) temp.clone();
			
			}

			
}