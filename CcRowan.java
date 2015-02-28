package grailgames;

class CcRowan extends Pure {
	
	/**
	 * Constructs a CcRowan
	 *
	 *@param currentHP - the current hit points of this CcRowan
	 */
	CcRowan(int currentHP, Player p) {
		super("CC Rowan",p,100,currentHP,0,"Rowan's Rampage", 40,0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}
	
}