package grailgames;

import java.io.IOException;

class StatusAdvance extends Training {
	StatusAdvance(Player p) {
		super("Status Advance", p);
	}

	/**
	 * Advances the status of a dueler
	 * 
	 * @param d
	 *            - the dueler that the card is effecting
	 * 
	 * @return a string indicating which dueler it has advanced to
	 */
	String effect(Dueler d) {
		if (d != null) {
			if (d.XP >= 3) {
				return d.evolve();
			} else {
				return "This dueler is not yet experienced enough to advance.";
			}
		} else {
			return "There is no Dueler in this position";
		}
	}

	@Override
	void play() throws IOException {
		System.out.println(effect(this.game.getFromHome(Util.playInput(game
				.getStream()))));

	}

}
