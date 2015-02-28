package grailgames;

import java.io.BufferedReader;

class PureHeal extends HolyHealthPotion{
	public PureHeal(Player p) {
		super("Pure Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkPure();
	}
	
	@Override
	void play (Game g, Player p, BufferedReader iStream) { 
		System.out.println(g.getFromHome())
	}
	


}
