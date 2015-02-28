package grailgames;

import java.io.IOException;

class JoustingPractice extends Training {
	JoustingPractice(Player p) {
		super("Jousting Practice", p);
	}
	public String effect(Dueler d) {
		return d.heal(30);
	}
	
	void play() throws IOException {
		System.out.println(effect(this.game.getFromHome(Util.playInput(game.getStream()))));
		
	}
}

