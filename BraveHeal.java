package grailgames;

import java.io.IOException;

class BraveHeal extends Training {

	/**
	 * Constructs a new Brave Heal training card
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	BraveHeal(Player p) {
		super("Brave Heal", p);
	}

	/**
	 * Replenishes the current hp of a dueler by a certain amount depending on
	 * type
	 * 
	 * @param d
	 *            - the dueler that the card is effecting
	 * 
	 * @return a string indicating how much hp the dueler has gained
	 */
	String effect(Dueler d) {
		return d.drinkBrave();
	}

	void play() throws IOException {
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game
				.getStream())))));
	}

}
