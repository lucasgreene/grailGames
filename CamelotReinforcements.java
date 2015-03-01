package grailgames;

class CamelotReinforcements extends Training {
	/**
	 * Draws three cards
	 * 
	 * @param p
	 *            - the player that the card belongs to
	 */
	CamelotReinforcements(Player p) {
		super("Camelot Reinforcements", p);
	}

	@Override
	void play() {
		String toReturn = p.name + " used " + this.name + "!";
		System.out.println(toReturn);
		p.draw();
		p.draw();
		p.draw();
	}

}
