package grailgames;

import java.io.IOException;

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
	public void play() throws IOException { 
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game.getStream())))));
	}
	

}
