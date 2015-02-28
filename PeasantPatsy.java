package grailgames;

class PeasantPatsy extends Royal{
	
	/**
	 * Constructs a PeasantPatsy
	 *
	 */
	PeasantPatsy(Player p) {
		super("Peasant Patsy",p,60,60,0,"Patsy Punch",30,0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}
}

