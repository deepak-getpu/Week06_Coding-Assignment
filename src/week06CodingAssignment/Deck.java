package week06CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
 
	List<Card> cards = new ArrayList<Card>();
	
	Deck() { 
		String[] numbers = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		String[] suits = {"Diamond", "Spade", "Heart", "Flower"};
	
	
		for (String suit : suits) {
			int count = 2;
			for (String number : numbers) {
				Card card = new Card(number, suit, count);
				cards.add(card);
				count++;
			}
		}
	}
	
	void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffleDeck() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	

	// G T
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	
	
}
