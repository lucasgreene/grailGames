package grailgames;

class CcConcorde extends Brave {

	/**
	 * Constructs a CcConcorde
	 *
	 * @param currentHP
	 *            - the current hit points of this dueler
	 * @param p
	 *            - the player that the card belongs to
	 */
	CcConcorde(int currentHP, Player p) {
		super("CC Concorde", p, 70, currentHP, 0, "Concorde's Conquer", 30);
	}

}
