package grailgames;

import java.io.IOException;

class PureHeal extends Training{
	public PureHeal(Player p) {
		super("Pure Heal", p);
	}
	public String effect(Dueler d) { 
		return d.drinkPure();
	}
	
	@Override
	public void play() throws IOException {
		System.out.println(p.name + " used " + this.name);
		System.out.println(effect((this.game.getFromHome(Util.playInput (game.getStream())))));
	}
	


}
