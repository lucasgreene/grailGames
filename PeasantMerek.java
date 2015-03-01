package grailgames;

class PeasantMerek extends Cowardly {

	/**
	 * Constructs a PeasantMerek
	 * 
	 * @param p
	 *            - the player that the dueler belongs to
	 *
	 */
	PeasantMerek(Player p) {
		super("Peasant Merek", p, 100, 100, 0, "Ballad Bash", 0);
	}

	@Override
	public String evolve() {
		Dueler levelUp = new MinstrelMerek(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP - this.currentHP);
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";

	}

}
