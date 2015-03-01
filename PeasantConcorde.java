package grailgames;

class PeasantConcorde extends Brave {

	/**
	 * Constructs a PeasantConcorde
	 *
	 * @param currentHP
	 *            - the current hit points of this Peasant Concorde
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	PeasantConcorde(Player p) {
		super("Peasant Concorde", p, 40, 40, 0, "Brave Bite", 30);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new CcConcorde(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}

}
