package grailgames;

public class BridgeDeath extends Training{
	BridgeDeath(Player p){
		super("Bridge of Death", p);
	}
	
	void effect(Dueler d) {
		//do something
	}
	
	public void play() { 
		System.out.println(effect((this.game.getFromHome(Util.playInput(p.iStream)))));
	}
	

}
