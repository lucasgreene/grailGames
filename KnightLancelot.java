package grailgames;

class KnightLancelot extends Brave {
	
	/**
	 * Constructs a KnightLancelot
	 *
	 *@param currentHP - the current hit points of this KnightLancelot
	 */
	KnightLancelot(Player p, int currentHP) {
		super("Knight Lancelot",p,140,currentHP,0,"Mighty Joust", 50,0);
	}
	
	@Override 
	public String attack(Dueler d) { 
		String toReturn = this.name + " used " + attackName + "! /n" + d.attackedByBrave(this);
		this.AP = this.AP + 5;
		return toReturn; 
	}
	
	@Override 
	public String evolve() {
		return null;
	}
	
	
	
}
