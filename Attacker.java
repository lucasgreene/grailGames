package grailgames;

interface Attacker {
	/**
	 * Attacks another dueler, reducing their HP
	 *
	 * @param d - the dueler attacked
	 */
	void attack(Dueler d);
	
	/**
	 * Dueler takes a certain amount of damage, reducing their HP
	 *
	 * @param HP - amount of damage
	 */
	void damage(int HP);
	
	

}
