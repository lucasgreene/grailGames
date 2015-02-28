package grailgames;

class KnightRobin extends Cowardly{
	
	/**
	 * Constructs a KnightRobin
	 *
	 *@param currentHP - the current hit points of this KnightRobin
	 */
	KnightRobin(Player p, int currentHP) {
		super("Knight Robin", p, 120,currentHP,0,"Camouflage", 60,0);
	}
	
	
	@Override 
	public String evolve() {
		return null;
	}
	

}
