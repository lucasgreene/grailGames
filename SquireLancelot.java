package grailgames;

class SquireLancelot extends Brave {

	/**
	 * Constructs a SquireLancelot
	 *
	 * @param currentHP
	 *            - the current hit points of this SquireLancelot
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	SquireLancelot(int currentHP, Player p) {
		super("Squire Lancelot", p, 100, currentHP, 0, "Sword Stab", 30);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new KnightLancelot(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}
}
