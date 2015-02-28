package grailgames;

class CcConcorde extends Brave {
	
	/**
	 * Constructs a CcConcorde
	 *
	 *@param currentHP - the current hit points of this dueler 
	 */
	CcConcorde(Player p, int currentHP) {
		super("CC Concorde",p, 70,currentHP,0,"Concorde's Conquer", 30,0);
	}
	
	public String evolve() {
		return null;
	}

	
}

