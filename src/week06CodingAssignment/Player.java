package week06CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private int score;
	
	private List<Card> handCards;
	
	public Player (String name) {
		this.name = name;
		this.handCards = new ArrayList<Card>();
		this.score = 0;	
	}
	
	void describe() {
		System.out.println("Name of the player: " + this.name + " Score: " + this.score);
		for (Card card : handCards) {
			card.describe();
		}
	}
	
	public Card flipCard() {
		Card card = this.handCards.remove(0); 
		card.describe();
		return card;
	}
	
	public void drawCard(Deck deck) {
		Card card = deck.draw();
		handCards.add(card);	
	}
	
	public void incrementScore () {
		this.score += 1;
	}

	
	
	// Getters and Setters
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	

}
