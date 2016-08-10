package com.bootcamp.playingcards;

import java.util.HashMap;

public class Rank {
	
	private String rank;	
	private static HashMap<String,Integer> rankList = new HashMap<String, Integer>(){{
		put("A",14);
		put("2",2);
		put("3",3);
		put("4",4);
		put("5",5);
		put("6",6);
		put("7",7);
		put("8",8);
		put("9",9);
		put("10",10);
		put("J",11);
		put("Q",12);
		put("K",13);
		
	}};
		
	public Rank(String rank){
		this.rank = rank.toUpperCase();
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank.toUpperCase();
	}

	public boolean isGreater(Rank rank2) {

		if(rankList.get(this.getRank()) > rankList.get(rank2.getRank()))
			return true;
		else
			return false;
	}
	
	public boolean isEqual(Rank rank2) {

		if(rankList.get(this.getRank()) == rankList.get(rank2.getRank()))
			return true;
		else
			return false;
	}
	
	public String toString(){
		return "Rank: " + rank;
	}

	
}
