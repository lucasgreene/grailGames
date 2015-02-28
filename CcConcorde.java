package grailgames;

class CcConcorde extends Brave {
	
	/**
	 * Constructs a CcConcorde
	 *
	 *@param currentHP - the current hit points of this dueler 
	 */
	CcConcorde(int currentHP,Player p) {
		super("CC Concorde",p, 70,currentHP,0,"Concorde's Conquer", 30,0);
	}
	
	public String evolve() {
		return null;
	}

	
}

