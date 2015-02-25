package grailgames;

class SquireRobin extends Cowerdly implements DuelerMoves{
	
	SquireRobin(int currentHP) {
		super("Squire Robin",100,currentHP,0,"Dash");
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void evolve() {
		// evolve to Knight Robin
	}
	
	public void damage(int HP) {
		
	}
	
}
