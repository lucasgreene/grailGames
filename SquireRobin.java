package grailgames;

class SquireRobin extends Cowardly {

	/**
	 * Constructs a SquireRobin
	 *
	 * @param currentHP
	 *            - the current hit points of this SquireRobin
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	SquireRobin(int currentHP, Player p) {
		super("Squire Robin", p, 100, currentHP, 0, "Dash", 30);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new KnightRobin(this.currentHP, this.p, 0);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}

}
