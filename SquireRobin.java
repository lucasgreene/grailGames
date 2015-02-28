package grailgames;

class SquireRobin extends Cowardly {
	
	/**
	 * Constructs a SquireRobin
	 *
	 *@param currentHP - the current hit points of this SquireRobin
	 */
	SquireRobin(int currentHP, Player p) {
		super("Squire Robin",p,100,currentHP,0,"Dash",30,0);
	}

	@Override 
	public String evolve() {
		return null;
	}

	
}
