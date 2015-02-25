package grailgames;

class KingArthur extends Royal implements DuelerMoves{
	
	KingArthur(int currentHP) {
		super("King Arthur",160,currentHP,0,"Excalibur");
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void evolve() {
		// evolve to nothing
	}
	
	public void damage(int HP) {
		
	}
	
}