package grailgames;

import java.io.IOException;

public class Player {
	
	String name;
	String[] deck;
	private Card[] hand;
	
	public Player(String name, String deckFileName) throws IOException {
		this.name = name;
		this.deck = GrailIO.getDeck(deckFileName);	
		
	}
	
	public void draw() {
		
	}
}
