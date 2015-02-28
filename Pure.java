package grailgames;

abstract class Pure extends Dueler{
	
	/**
	 * Constructs a new pure dueler 
	 *
	 *@param name - name of the pure dueler
	 *@param maxHP - the maximum hit points of the pure dueler 
	 *@param currentHP - the current hit points of the pure dueler
	 *@param XP - the amount of experience points
	 *@param attackName - the name of the pure dueler's attack 
	 *@param AP - the amount of attack points of the pure dueler's attack
	 *
	 */
	Pure(String name,Player p, int maxHP, int currentHP, int XP, String attackName, int AP, int arena) {
		super(name, p,maxHP,currentHP,XP, attackName, AP, arena);
	}
	
	@Override
	public String attackedByCowardly(Dueler d) { 
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}
		return "It's not very effective ... /n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByRoyal(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 
		
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}

		return "It's super effective! /n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public void attack(Dueler d) { 
		System.out.println(this.name + " used " + attackName + "! /n" + d.attackedByPure(this)); 
		
	}
	@Override 
	public String drinkPure() {
		return heal(30);
	}

}
