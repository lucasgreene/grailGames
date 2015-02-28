package grailgames;

import java.io.IOException;

class BraveHeal extends Training{

	public BraveHeal(Player p) {
		super("Brave Heal", p);
	}
	public String effect(Dueler d) { 
		return d.drinkBrave();
	}
	
	public void play() throws IOException { 
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput(game.getStream())))));
	}


}
