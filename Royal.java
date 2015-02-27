package grailgames;

abstract class Royal extends Dueler{
	
	Royal(String name, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name,maxHP,currentHP,XP, attackName, AP);
	}
	
	@Override
	public String attackedByPure(Dueler d) { 
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		return this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByBrave(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	public String attack(Dueler d) { 
		d.attackedByRoyal(this);
		return this.name + " used " + attackName + "!"; 
		
	}
}

