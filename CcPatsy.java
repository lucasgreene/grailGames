package grailgames;

class CcPatsy extends Royal {
	
	/**
	 * Constructs a CcPatsy
	 *
	 *@param currentHP - the current hit points of this dueler 
	 */
	CcPatsy(Player p, int currentHP) {
		super("CC Patsy", p,100,currentHP,0,"Coconut Chuck", 50,0);
	}
	
	
	public String evolve() {
		return null;
	}

	
}
