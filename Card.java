package grailgames;

import java.io.BufferedReader;

abstract class Card {
	String name; 
	
	/**
	 * Constructs a card
	 *
	 *@param name - the name of the card
	 */
	Card (String name) { 
		this.name = name;
	}	
	
	String play (Player p, BufferedReader iStream) { 
		return null;
	}
	

}
