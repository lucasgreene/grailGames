package grailgames;

class KnightLancelot extends Brave {
	
	/**
	 * Constructs a KnightLancelot
	 *
	 * @param currentHP
	 *            - the current hit points of this KnightLancelot
	 * @param p
	 *            - the player that the dueler belongs to
	 */
	KnightLancelot(int currentHP, Player p) {
		super("Knight Lancelot",p,140,currentHP,0,"Mighty Joust", 50);
	}
	
	@Override 
	public void attack(Dueler d) { 
		String toReturn = this.name + " used " + attackName + "! \n" + d.attackedByBrave(this);
		this.AP = this.AP + 5;
		System.out.println(toReturn + "Knight Lancelot gains 5 attack points!"); 
	}
	
	
	
	
}
