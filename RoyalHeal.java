package grailgames;

import java.io.IOException;

class RoyalHeal extends Training {

	/**
	 * Constructs a new Royal Heal training card
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	public RoyalHeal(Player p) {
		super("Royal Heal", p);
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
	public String effect(Dueler d) {
		return d.name + " used " + this.name + "! \n" + d.drinkRoyal();
	}

	void play() throws IOException {
		System.out.println(effect(this.game.getFromHome(Util.playInput(game
				.getStream()))));
	}

}
