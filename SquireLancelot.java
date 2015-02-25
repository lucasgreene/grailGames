package grailgames;

class SquireLancelot extends Brave implements DuelerMoves{
	
	SquireLancelot(int currentHP) {
		super("Squire Lancelot",100,currentHP,0,"Sword Stab");
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void evolve() {
		// evolve to Knight Lancelot
	}
	
	public void damage(int HP) {
		
	}
	
}
