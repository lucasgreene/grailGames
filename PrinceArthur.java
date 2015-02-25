package grailgames;

class PrinceArthur extends Royal implements DuelerMoves{
	
	PrinceArthur(int currentHP) {
		super("Prince Arthur",120,currentHP,0,"Trivia Tackle");
	}
	
	public void attack(Dueler d) { 
		// do something
	}
	
	public void evolve() {
		// evolve to King Arthur
	}
	
	public void damage(int HP) {
		
	}
	
}