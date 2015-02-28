package grailgames;

class CcRowan extends Pure {
	
	/**
	 * Constructs a CcRowan
	 *
	 *@param currentHP - the current hit points of this CcRowan
	 */
	CcRowan(int currentHP) {
		super("CC Rowan",100,currentHP,0,"Rowan's Rampage", 40,0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}
	
}