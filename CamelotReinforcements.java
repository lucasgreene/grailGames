package grailgames;

import java.io.BufferedReader;

class CamelotReinforcements extends Training {
	
	CamelotReinforcements(Player p) {
		super("Camelot Reinforcements",p);
	}
	
	@Override
	void play (Game g, Player p, BufferedReader iStream) { 
		p.draw();
		p.draw();
		p.draw();
		String toReturn = p.name + " used " + this.name + "! /n" + p.name + " drew three cards!";
		System.out.println(toReturn);
	}
	
	

}
