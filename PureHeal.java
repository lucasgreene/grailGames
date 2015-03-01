package grailgames;

import java.io.IOException;

class PureHeal extends Training {
	
	/**
	 * Constructs a new Pure Heal training card
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	public PureHeal(Player p) {
		super("Pure Heal", p);
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
		return d.drinkPure();
	}

	@Override
	void play() throws IOException {
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game
				.getStream())))));
	}

}
