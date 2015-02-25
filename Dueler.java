package grailgames;

class Dueler extends Card {
	int maxHP;
	int currentHP;
	int XP;
	int turn;
	String attackName;
	
	Dueler(String name, int maxHP, int currentHP, int XP, String attackName) {
		super(name);
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.XP = XP;
		this.attackName = attackName;
	}
	
	@Override 
	public String toString() {
		return "Do something";
	}

}
