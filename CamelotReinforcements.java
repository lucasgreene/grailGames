package grailgames;


class CamelotReinforcements extends Training {
	
	CamelotReinforcements(Player p) {
		super("Camelot Reinforcements",p);
	}
	
	@Override
	void play() { 
		String toReturn = p.name + " used " + this.name + "! \n";
		System.out.println(toReturn);
		p.draw();
		p.draw();
		p.draw();
	}
	
	

}
