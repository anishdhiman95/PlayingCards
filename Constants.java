package com.bootcamp.playingcards;

enum Constants {
	SPADE("S"),
	CLUB("C"),
	HEARTS("H"),
	DIAMONDS("D"),
	TWO("2"),
	THREE("3"),
	FOUR("4"),
	FIVE("5"),
	SIX("6"),
	SEVEN("7"),
	EIGHT("8"),
	NINE("9"),
	TEN("10"),
	JACK("11"),
	QUEEN("12"),
	KING("13"),
	ACE("14");
	
	private String value;

    Constants(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}
