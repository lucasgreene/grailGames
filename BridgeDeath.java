package grailgames;

import java.io.IOException;


public class BridgeDeath extends Training{
	BridgeDeath(Player p){
		super("Bridge of Death", p);
	}
	
	void effect(int i) {
		game.awaySwitch(i);
		
		
	}
	
	public void play() throws IOException{ 
		effect(Util.playInput(game.iStream));
	}
	

}
