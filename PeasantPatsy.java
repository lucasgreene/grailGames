package grailgames;

class PeasantPatsy extends Royal {

	/**
	 * Constructs a PeasantPatsy
	 * 
	 * @param p
	 *            - the player that the dueler belongs to
	 *
	 */
	PeasantPatsy(Player p) {
		super("Peasant Patsy", p, 60, 60, 0, "Patsy Punch", 30);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new CcPatsy(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}
}
