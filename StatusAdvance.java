package grailgames;

import java.io.IOException;

class StatusAdvance extends Training {
	StatusAdvance(Player p) {
		super("Status Advance",p);
	}
	String effect(Dueler d) {
		if (d.XP >= 3) {
			return d.evolve();
		} else {
			return "This dueler is not yet experienced enough to advance.";
		}
	}
		
	@Override
	void play() throws IOException {
		System.out.println(effect(this.game.getFromHome(Util.playInput(game.iStream))));
			
	}
		
		

}
