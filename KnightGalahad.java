package grailgames;


class KnightGalahad extends Pure implements DuelerMoves{
	
	KnightGalahad(int currentHP) {
		super("Knight Galahad",120,currentHP,0,"Punch of Purity");
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void evolve() {
		// do nothing cannot evolve
	}
	
	public void damage(int HP) {
		
	}
	
}
