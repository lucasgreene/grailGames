package grailgames;

import java.io.IOException;

class BridgeDeath extends Training {
	BridgeDeath(Player p) {
		super("Bridge of Death", p);
	}

	/**
	 * Switches the opponents duelers in the away arena
	 * 
	 * @param i
	 *            - the spot that the arena dueler will switch with
	 *
	 */
	void effect(int i) {
		if (i >= 1) {
			game.bridgeOfdeath(i);
		} else {
			System.out.print("No effect!");
		}
	}

	@Override
	void play() throws IOException {
		System.out.println(p.name + " played Bridge Of Death");
		effect(Util.playInput(game.getStream()));
	}

}
