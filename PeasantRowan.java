package grailgames;

class PeasantRowan extends Pure {

	/**
	 * Constructs a PeasantRowan
	 * 
	 * @param p
	 *            - the player that the dueler belongs to
	 *
	 */
	PeasantRowan(Player p) {
		super("Peasant Rowan", p, 80, 80, 0, "Roundhouse Kick", 20);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new CcRowan(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}
}
