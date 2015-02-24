package grailgames;

interface DuelerMoves {
	
	/**
	 * Attacks another dueler, reducing their HP
	 *
	 * @param d - the dueler attacked
	 */
	void attack(Dueler d);
	

	/**
	 * Evolves a dueler advancing them to the next status
	 *
	 */
	void evolve();
	

	/**
	 * Dueler takes a certain amount of damage, reducing their HP
	 *
	 * @param HP - amount of damage
	 */
	void damage(int HP);
	
	

}
