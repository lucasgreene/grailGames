package grailgames;

abstract class Royal extends Dueler{
	
	/**
	 * Constructs a new royal dueler 
	 *
	 *@param name - name of the royal dueler
	 *@param p - the player that the dueler belongs to 
	 *@param maxHP - the maximum hit points of the royal dueler 
	 *@param currentHP - the current hit points of the royal dueler
	 *@param XP - the amount of experience points
	 *@param attackName - the name of the royal dueler's attack 
	 *@param AP - the amount of attack points of the royal dueler's attack
	 *
	 */
	Royal(String name, Player p, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name, p,maxHP,currentHP,XP, attackName, AP);
	}
	
	@Override
	public String attackedByPure(Dueler d) { 
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}
		return "It's not very effective ... \n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByBrave(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 
		
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}

		return "It's super effective! \n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public void attack(Dueler d) { 
		System.out.println(this.name + " used " + attackName + "!"); 
		System.out.println(d.attackedByRoyal(this)); 
		
	}
	
	@Override 
	public String drinkRoyal() {
		return heal(30);
	}
}

