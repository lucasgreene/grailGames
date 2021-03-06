package grailgames;

abstract class Cowardly extends Dueler {

	/**
	 * Constructs a new cowardly dueler
	 *
	 * @param name
	 *            - name of the cowardly dueler
	 * @param p
	 *            - the player that the card belongs to
	 * @param maxHP
	 *            - the maximum hit points of the cowardly dueler
	 * @param currentHP
	 *            - the current hit points of the cowardly dueler
	 * @param XP
	 *            - the amount of experience points
	 * @param attackName
	 *            - the name of the cowardly dueler's attack
	 * @param AP
	 *            - the amount of attack points of the cowardly dueler's attack
	 *
	 */
	Cowardly(String name, Player p, int maxHP, int currentHP, int XP,
			String attackName, int AP) {
		super(name, p, maxHP, currentHP, XP, attackName, AP);
	}

	@Override
	public String attackedByBrave(Dueler d) {
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP - 20;
			this.currentHP = this.currentHP - damage;
		}

		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}

		return "It's not very effective ... \n" + this.name + " took " + damage
				+ " damage.";
	}

	@Override
	public String attackedByPure(Dueler d) {
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage;

		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}

		return "It's super effective! \n" + this.name + " took " + damage
				+ " damage.";
	}

	@Override
	public void attack(Dueler d) {
		System.out.println(this.name + " used " + attackName + "!");
		System.out.println(d.attackedByCowardly(this));

	}

	@Override
	public String drinkCowardly() {
		return heal(30);
	}

}
