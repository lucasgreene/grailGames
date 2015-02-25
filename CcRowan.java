package grailgames;

class CcRowan extends Pure implements DuelerMoves{
	
	CcRowan(int currentHP) {
		super("CC Rowan",100,currentHP,0,"Rowan's Rampage");
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