package grailgames;

class PrinceArthur extends Royal {
	
	/**
	 * Constructs a PrinceArthur
	 *
	 *@param currentHP - the current hit points of this PrinceArthur
	 */
	PrinceArthur(int currentHP) {
		super("Prince Arthur",120,currentHP,0,"Trivia Tackle", 40,0);
	}
	
	@Override 
	public String evolve() {
		return null;
	}

}