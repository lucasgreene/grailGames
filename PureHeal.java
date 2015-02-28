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
	public void play() { 
		System.out.println(effect((getFromHome(Util.playInput(p.iStream)))));
	}
	


}
