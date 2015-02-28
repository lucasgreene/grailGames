package grailgames;

class KnightRobin extends Cowardly{
	
	/**
	 * Constructs a KnightRobin
	 *
	 *@param currentHP - the current hit points of this KnightRobin
	 */
	KnightRobin(int currentHP) {
		super("Knight Robin",120,currentHP,0,"Camouflage", 60,0);
	}
	
	
	@Override 
	public String evolve() {
		return null;
	}
	

}
