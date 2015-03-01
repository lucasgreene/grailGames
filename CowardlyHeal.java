package grailgames;

import java.io.IOException;

class CowardlyHeal extends Training {

	/**
	 * Constructs a new Cowardly Heal training card
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	CowardlyHeal(Player p) {
		super("Cowardly Heal", p);
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
		if (d != null) {
			return d.drinkCowardly();
	    } else {
	    	return "No dueler in this position";
	    }
	}

	@Override
	void play() throws IOException {
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game
				.getStream())))));
	}

}
