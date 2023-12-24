package week06CodingAssignment;

public class ACards {
	
	String name;
	String suit; 
	int value; 
	
	public ACards (String name, String suit, int value) {
		this.name=name;
		this.suit=suit;
		this.value=value;		
	}
	
	ACards (String name, String suit) {
		this.name=name;
		this.suit=suit;
	}
	
	ACards (String suit) {
	this.suit = suit;	
	}
	
	ACards () {}
	
	void describe() {
		System.out.println("Name: " + this.name + "\t Suit: " + this.suit + "\t Value: " + value);
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}



}
