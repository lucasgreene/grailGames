package grailgames;

import java.io.IOException;

class JoustingPractice extends Training {
	JoustingPractice(Player p) {
		super("Jousting Practice", p);
	}
	public String effect(Dueler d) {
		d.maxHP += 20;
		System.out.println(d.name + " increased max HP by 20!");
		return d.heal(20);
	}
	
	void play() throws IOException {
		System.out.println(p.name + " used JoustingPractice!");
		System.out.println(effect(this.game.getFromHome(Util.playInput(game.getStream()))));
		
	}
}

