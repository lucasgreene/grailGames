package grailgames;

import java.io.IOException;

abstract class Card {
	String name;
	Player p;
	Game game;

	/**
	 * Constructs a card
	 *
	 * @param name
	 *            - the name of the card
	 */
	Card(String name, Player p) {
		this.name = name;
		this.p = p;
		this.game = p.game;
	}

	/**
	 * Either puts a dueler in the field or plays a training card
	 */
	abstract void play() throws IOException;

}
