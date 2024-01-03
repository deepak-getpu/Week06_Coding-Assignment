package week06CodingAssignment;

public class App0 {

	public static void main(String[] args) {
	
		
		Practice1 card = new Practice1("Five", "Diamond", 5);
	
		Practice2 deck = new Practice2 ();
		deck.describe();
		
		Practice1 deckDraw = deck.draw();
		System.out.println("New Output");
		deckDraw.describe();

	
		
	
		
		
	}

}