package grailgames;

import java.io.IOException;

class AnthraxAsylum extends Training {
	/**
	 * Constructs a new Anthrax Asylum training card
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	AnthraxAsylum(Player p) {
		super("Anthrax Asylum", p);
	}

	/**
	 * Replenishes a dueler's hp
	 * 
	 * @param d
	 *            - the dueler that the card is effecting
	 */
	String effect(Dueler d) {
		int gain = d.maxHP - d.currentHP;
		d.currentHP = d.maxHP;
		return d.name + " regains " + gain + " HP!";

	}

	@Override
	public void play() throws IOException {
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game
				.getStream())))));
	}

}
