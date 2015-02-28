package grailgames;

class KingArthur extends Royal {
	
	/**
	 * Constructs a KingArthur 
	 *
	 *@param currentHP - the current hit points of this KingArthur
	 */
	KingArthur(Player p, int currentHP) {
		super("King Arthur", p, 160,currentHP,0,"Excalibur",50, 0);
	}
	
	@Override
	public void attack(Dueler d) { 
		System.out.println(this.name + " used " + attackName + "!");
		game.banish();
		this.currentHP = this.currentHP - 60;
		System.out.println(this.name + " has lost 60 HP!");
		if (this.currentHP <= 0) {
			game.suicide();
			System.out.print("King Arthur has killed himself!");
		}
		System.out.println(d.name + " has been exiled from castle camelot!");
		
	}
		
		
	
	
}