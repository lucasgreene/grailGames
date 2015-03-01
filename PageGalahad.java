package grailgames;

class PageGalahad extends Pure {

	/**
	 * Constructs a PageGalahad
	 *
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	PageGalahad(Player p) {
		super("Page Galahad", p, 60, 60, 0, "Chivalrous Cut", 20);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new SquireGalahad(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}

}
