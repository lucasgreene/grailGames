package grailgames;


abstract class Cowardly extends Dueler {
	
	Cowardly(String name, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name,maxHP,currentHP,XP,attackName, AP);
	}
	
	@Override
	public String attackedByBrave(Dueler d) { 
		int damage = 0;
		if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		return this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByPure(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	
	public String attack(Dueler d) { 
		d.attackedByCowardly(this);
		return this.name + " used " + attackName + "!"; 
		
	}
	
	public String usePotion(Training t) {
		int heal = 0; 
		if (t.name.equals("Cowardly Heal")) {
			heal = 30;
		} else {
			heal = 10;
		}
		if ((this.currentHP + heal) > this.maxHP) { 
			heal = this.maxHP - this.currentHP;
		}
		this.currentHP = this.currentHP + heal;
		return this.name + " gained " + heal + " HP!" ;
	}

}
