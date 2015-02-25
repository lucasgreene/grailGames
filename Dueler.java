package grailgames;

class Dueler extends Card {
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

}
