package grailgames;

import java.io.IOException;

class PureHeal extends Training{
	public PureHeal(Player p) {
		super("Pure Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkPure();
	}
	
	@Override
	public void play() throws IOException { 
		System.out.println(effect((game.getFromHome(Util.playInput (game.iStream)))));
	}
	


}
