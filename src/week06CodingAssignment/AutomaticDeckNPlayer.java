package week06CodingAssignment;

public class AutomaticDeckNPlayer {

	public static void main(String[] args) {
	
		
		ACards card = new ACards("Five", "Diamond", 5);
	
		ADeck deck = new ADeck ();
		deck.describe();
		
		ACards deckDraw = deck.draw();
		System.out.println("New Output");
		deckDraw.describe();

		
	
		
		
	}

}