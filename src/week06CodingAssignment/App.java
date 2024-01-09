package week06CodingAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player p1 = new Player("Henry");
		Player p2 = new Player ("David");
		deck.shuffleDeck();
		
		List<Player> players = new ArrayList <Player> ();
		players.add(p1);
		players.add(p2);
		
		for (int i=1; i<=26; i++) {	
			for (Player player : players) {
				player.drawCard(deck);
			}
		}

		for (int i=1; i<=26; i++) {
			System.out.println("Round: " + i);
			Card p1Draw = p1.flipCard();
			Card p2Draw = p2.flipCard(); 
			
			if ((p1Draw.getValue()) > p2Draw.getValue()) {
				p1.incrementScore();
				System.out.println("P1 got the point.");
				
			} else if ((p1Draw.getValue()) < p2Draw.getValue()) {
				p2.incrementScore();
				System.out.println("P2 got the point.");
			} else {
				System.out.println("No one got the point.");
			}
			System.out.println("Player 1 score " + p1.getScore());
			System.out.println("Player 2 score " + p2.getScore());
			System.out.println();
		}
		
		int a = p1.getScore();
		int b = p2.getScore();
		
		if (a>b) {
			System.out.println("Player 1 won");
			System.out.println("Player 1 final score " + p1.getScore());
			System.out.println("Player 2 final score " + p2.getScore());
		} else if (a < b) {
			System.out.println("Player 2 won");
			System.out.println("Player 1 final score " + p1.getScore());
			System.out.println("Player 2 final score " + p2.getScore());
		} else {
			System.out.println("No one won!");
			System.out.println("Player 1 final score " + p1.getScore());
			System.out.println("Player 2 final score " + p2.getScore());
		}
	

	}
}
