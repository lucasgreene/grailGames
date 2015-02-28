package grailgames;

class PeasantConcorde extends Brave{
	
	/**
	 * Constructs a PeasantConcorde
	 *
	 *@param currentHP - the current hit points of this Peasant Concorde
	 */
	PeasantConcorde(Player p) {
		super("Peasant Concorde", p,40,40,0,"Brave Bite", 30,0);
	}
	
	
	@Override 
	public String evolve() {
		return null;
	}
	

	
}
