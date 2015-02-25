package grailgames;

abstract class Royal extends Dueler implements Attacker{
	
	Royal(String name, int maxHP, int currentHP, int XP, String attackName, int AP) {
		super(name,maxHP,currentHP,XP, attackName, AP);
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void damage(int HP) {
		
	}

}

