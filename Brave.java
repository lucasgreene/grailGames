package grailgames;

abstract class Brave extends Dueler {
	
	/**
	 * Constructs a new brave dueler
	 *
	 *@param name - name of the brave dueler
	 *@param maxHP - the maximum hit points of the brave dueler 
	 *@param currentHP - the current hit points of the brave dueler
	 *@param XP - the amount of experience points
	 *@param attackName - the name of the brave dueler's attack 
	 *@param AP - the amount of attack points of the brave dueler's attack
	 *
	 */
	Brave(String name, Player p, int maxHP, int currentHP, int XP, String attackName, int AP, int arena) {
		super(name, p, maxHP,currentHP,XP,attackName, AP, arena);
	}
	
	
	@Override
	public String attackedByRoyal(Dueler d) { 
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		return this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByCowardly(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	@Override 
	public String attack(Dueler d) { 
		return this.name + " used " + attackName + "! /n" + d.attackedByBrave(this); 
		
		
	}
	
	@Override 
	public String drinkBrave() {
		int heal = 30;
		int room = this.maxHP - this.currentHP;
		if (room < heal) {
			heal = room;
		} 
		this.currentHP = heal + this.currentHP;
		return this.name + " gained " + heal + "HP!";
	}
}

