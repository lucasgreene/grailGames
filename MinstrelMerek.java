package grailgames;

class MinstrelMerek extends Cowardly {
	
	/**
	 * Constructs a MinstrelMerek
	 *
	 *@param currentHP - the current hit points of this MinstrelMerek
	 *@param p - the player that the dueler belongs to
	 */
	MinstrelMerek(int currentHP,Player p) {
		super("Minstrel Merek",p,150,currentHP,0,"Lute Laceration", 50);
	}
	
}

