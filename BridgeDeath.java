package grailgames;

import java.io.IOException;


public class BridgeDeath extends Training{
	BridgeDeath(Player p){
		super("Bridge of Death", p);
	}
	
	void effect(int i) {
		if (i >= 1) {
			game.bridgeOfdeath(i);
		} else {
			System.out.print("No effect!");
		}
	}
	
	public void play() throws IOException{
		System.out.println(p.name + " played Bride Of Death");
		effect(Util.playInput(game.getStream()));
	}
	

}
