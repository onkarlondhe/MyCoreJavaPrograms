package com.mzos.stack;

public class Card {

	private int cardId;
	private String CardName;
	
	
	public Card(int cardId, String cardName) {
		super();
		this.cardId = cardId;
		CardName = cardName;
	}


	public int getCardId() {
		return cardId;
	}


	public void setCardId(int cardId) {
		this.cardId = cardId;
	}


	public String getCardName() {
		return CardName;
	}


	public void setCardName(String cardName) {
		CardName = cardName;
	}


	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", CardName=" + CardName + "]";
	}
	
	
	
	
	
}
