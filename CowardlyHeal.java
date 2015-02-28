package grailgames;

import java.io.IOException;

class CowardlyHeal extends Training{
	public CowardlyHeal(Player p) {
		super("Cowardly Heal", p);
	}
	public String effect(Dueler d) { 
		return d.drinkCowardly();
	}
	
	public void play() throws IOException { 
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game.iStream)))));
	}


}
