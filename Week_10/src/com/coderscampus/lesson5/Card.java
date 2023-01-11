package com.coderscampus.lesson5;

public enum Card {

	ACE(14),
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEM(10),
	JACK(11),
	QUEEN(12),
	KING(13);
	
	private Card (Integer cardValue) {
		this.cardValue = cardValue;
	}
	
	private Integer cardValue;

	public Integer getCardValue() {
		return cardValue;
	}

	public void setCardValue(Integer cardValue) {
		this.cardValue = cardValue;
	}
	
	
}
