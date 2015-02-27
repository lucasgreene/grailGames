package grailgames;

class AnthraxAsylum extends Training {
	AnthraxAsylum() {
		super("Anthrax Asylum");
	}
	String effect(Dueler d) {
		int gain = d.maxHP - d.currentHP;
		d.currentHP = d.maxHP;
		return d.name + " regains " + gain + " HP!";
		
	}
	

}
