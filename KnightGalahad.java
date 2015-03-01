package grailgames;


class KnightGalahad extends Pure {
	
	/**
	 * Constructs a KnightGalahad
	 *
	 *@param currentHP - the current hit points of this KnightGalahad
	 *@param p - the player that the dueler belongs to
	 */
	KnightGalahad(int currentHP, Player p) {
		super("Knight Galahad",p,120,currentHP,0,"Punch of Purity",60);
	}
	
	@Override
	public void attack(Dueler d) {
		String toReturn = this.name + " used " + attackName + "! \n" + d.attackedByPure(this);
		game.galahadSpecial();
		System.out.println(toReturn); 
	}
	
	@Override
	public void pass() { 
		game.galahadSpecial();
	}
	
	
}
