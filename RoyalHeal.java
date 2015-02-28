package grailgames;

import java.io.IOException;

class RoyalHeal extends Training{
	public RoyalHeal(Player p) {
		super("Royal Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! \n" + d.drinkRoyal();
	}
	
	void play() throws IOException {
		System.out.println(effect(this.game.getFromHome(Util.playInput(game.iStream))));
	}


}
