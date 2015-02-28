package grailgames;

import java.io.IOException;


abstract class Card {
	String name;
	Player p;
	Game game;
	
	/**
	 * Constructs a card
	 *
	 *@param name - the name of the card
	 */
	Card (String name, Player p) { 
		this.name = name;
		this.p = p;
		this.game = p.game;
	}
	
	abstract void play () throws IOException; 
	

}
