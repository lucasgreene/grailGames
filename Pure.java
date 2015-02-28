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
		return this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByRoyal(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attack(Dueler d) { 
		d.attackedByPure(this);
		return this.name + " used " + attackName + "! /n" + d.attackedByPure(this); 
		
	}
	@Override 
	public String drinkPure() {
		int heal = 30;
		int room = this.maxHP - this.currentHP;
		if (room < heal) {
			heal = room;
		} 
		this.currentHP = heal + this.currentHP;
		return this.name + " gained " + heal + "HP!";
	}

}
