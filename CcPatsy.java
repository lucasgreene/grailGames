package grailgames;

class CcPatsy extends Royal {

	/**
	 * Constructs a CcPatsy
	 *
	 * @param currentHP
	 *            - the current hit points of this dueler
	 *
	 * @param p
	 *            - the player that the card belongs to
	 */
	CcPatsy(int currentHP, Player p) {
		super("CC Patsy", p, 100, currentHP, 0, "Coconut Chuck", 50);
	}

}
