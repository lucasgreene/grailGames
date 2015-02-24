package grailgames;

class Dueler extends Card {
	int maxHP;
	int currentHP;
	int XP;
	int turn;
	
	Dueler(String name, int maxHP, int currentHP, int XP, int turn) {
		super(name);
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.XP = XP;
		this.turn = turn;
	}

}
