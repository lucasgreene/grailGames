package grailgames;

class AnthraxAsylum extends Training {
	AnthraxAsylum(Player p) {
		super("Anthrax Asylum", p);
	}
	String effect(Dueler d) {
		int gain = d.maxHP - d.currentHP;
		d.currentHP = d.maxHP;
		return d.name + " regains " + gain + " HP!";
		
	}
	
	@Override 
	public void play() { 
		System.out.println(effect((getFromHome(Util.playInput(p.iStream)))));
	}
	

}
