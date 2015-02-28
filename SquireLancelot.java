package grailgames;

class SquireLancelot extends Brave {
	
	/**
	 * Constructs a SquireLancelot
	 *
	 *@param currentHP - the current hit points of this SquireLancelot
	 */
	SquireLancelot(int currentHP, Player p) {
		super("Squire Lancelot", p,100,currentHP,0,"Sword Stab",30,0);
	}

	
	@Override 
	public String evolve() {
		return null;
	}
	
}
