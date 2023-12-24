package week06CodingAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ADeck {
	
	List<ACards> cards = new ArrayList <ACards>();
	

	ADeck() {
		String[] suits = {"Diamond", "Spade", "Heart", "Club"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		for (String suit : suits) {
			int count = 2; 
			for (String name : names) {
			ACards card = new ACards(name, suit, count);
			this.cards.add(card);  
			count++;
			}
		}
	}
	
	void describe() {
		for (ACards card: cards) { 
			card.describe();
		}
	}
	
	ACards draw () {
		ACards card = this.cards.remove(1);
		return card;
	}
	
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	
	public List<ACards> getCards() {
		return cards;
	}

	public void setCards(List<ACards> cards) {
		this.cards = cards;
	}

	
//	public static Map<String, List<String>> createGame (int numberOfPlayers) {
//		Map<String, List<String>> tempGame = new HashMap<String, List<String>>();  
//		ADeck deck = new ADeck();
//		deck.shuffle();
//		deck.draw();
//		
//		for(int i =1; i<52/numberOfPlayers; i++) {
//			for (int j=1; j<=numberOfPlayers; j++) {
//				String player = "player" + i;
//				List<String> cardsPlayer = tempGame.get(player);
////				cardsPlayer.put(ADeck.draw());
				

//		}
		
//	}
}

