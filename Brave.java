package grailgames;

abstract class Brave extends Dueler {
	
	Brave(String name, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name,maxHP,currentHP,XP,attackName, AP);
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
	
	public String attack(Dueler d) { 
		d.attackedByBrave(this);
		return this.name + " used " + attackName + "!"; 
		
	}
	

	
	


}

