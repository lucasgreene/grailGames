package grailgames;

class PageLancelot extends Brave {

	/**
	 * Constructs a PageLancelot
	 *
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	PageLancelot(Player p) {
		super("Page Lancelot", p, 60, 60, 0, "Punch of Fury", 20);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new SquireLancelot(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}

}
