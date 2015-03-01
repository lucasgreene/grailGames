package grailgames;

class CcRowan extends Pure {

	/**
	 * Constructs a CcRowan
	 *
	 * @param currentHP
	 *            - the current hit points of this CcRowan
	 *
	 * @param p
	 *            - the player that the card belongs to
	 */
	CcRowan(int currentHP, Player p) {
		super("CC Rowan", p, 100, currentHP, 0, "Rowan's Rampage", 40);
	}

}