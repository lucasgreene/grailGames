package grailgames;

class JoustingPractice extends Training {
	JoustingPractice(Player p) {
		super("Jousting Practice", p);
	}
	public String effect(Dueler d) {
		int heal = 30;
		int room = d.maxHP - d.currentHP;
		if (room < heal) {
			heal = room;
		} 
		d.currentHP = heal + d.currentHP;
		return d.name + " gained " + heal + "HP!";
	}
}

