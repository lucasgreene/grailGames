package grailgames;

abstract class Dueler extends Card {
	int maxHP;
	int currentHP;
	int XP;
	int turn;
	String attackName;
	int AP;
	
	Dueler(String name, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name);
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.XP = XP;
		this.attackName = attackName;
		this.AP = AP;
	}
	
	@Override 
	public String toString() {
		return "Do something";
	}
	
	public String attackedByCowardly(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	public String attackedByBrave(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
		
	}
	
	public String attackedByPure(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	public String attackedByRoyal(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
		
	}


}
