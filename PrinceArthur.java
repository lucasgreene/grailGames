package grailgames;

class PrinceArthur extends Royal implements DuelerMoves{
	
	PrinceArthur(int currentHP) {
		super("Prince Arthur",120,currentHP,0,"Trivia Tackle", 40);
	}
	
	public void evolve() {
		// evolve to King Arthur
	}

}