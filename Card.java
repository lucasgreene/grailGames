package grailgames;


abstract class Card {
	String name;
	Player p;
	Game game = p.game;
	
	/**
	 * Constructs a card
	 *
	 *@param name - the name of the card
	 */
	Card (String name, Player p) { 
		this.name = name;
		this.p = p;
	}	
	
	abstract void play (); 
	

}
