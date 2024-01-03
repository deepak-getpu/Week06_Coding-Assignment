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
		
		for (int i=1; i<=52; i++) {	
			for (Player player : players) {
				player.drawCard(deck);
			}
		}

		for (int i=1; i<=26; i++) {
			p1.flipCard();
			p2.flipCard(); 
			if ((p1.flipCard().getValue()) > p2.flipCard().getValue()) {
				p1.incrementScore();
				System.out.println("P1 got the point.");
			} else if ((p1.flipCard().getValue()) < p2.flipCard().getValue()) {
				p2.incrementScore();
				System.out.println("P2 got the point");
			} else {
				System.out.println("No one got the point.");
			}
			
		}
		
		int a = p1.getScore();
		int b = p2.getScore();
		
		if (a>b) {
			System.out.println("Player 1 won");
			System.out.println("Score: " + a);
		} else if (a < b) {
			System.out.println("Player 2 won");
			System.out.println("Score: " + b);
		} else {
			System.out.println("No one won!");
		    System.out.println("Score for P1: " + a);
		    System.out.println("Score for P2: " + b);
		}
	

	}
}
