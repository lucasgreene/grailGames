package grailgames;

class SquireGalahad extends Pure {
	
	/**
	 * Constructs a SquireGalahad
	 *
	 *@param currentHP - the current hit points of this SquireGalahad
	 */
	SquireGalahad(int currentHP) {
		super("Squire Galahad",90,currentHP,0,"Gallant Gash",30,0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}
	
}

