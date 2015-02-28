package grailgames;

class KingArthur extends Royal {
	
	/**
	 * Constructs a KingArthur 
	 *
	 *@param currentHP - the current hit points of this KingArthur
	 */
	KingArthur(int currentHP) {
		super("King Arthur",160,currentHP,0,"Excalibur",50, 0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}
	
	
}