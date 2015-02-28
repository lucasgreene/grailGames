package grailgames;


class CamelotReinforcements extends Training {
	
	CamelotReinforcements(Player p) {
		super("Camelot Reinforcements",p);
	}
	
	@Override
	void play() { 
		p.draw();
		p.draw();
		p.draw();
		String toReturn = p.name + " used " + this.name + "! /n" + p.name + " drew three cards!";
		System.out.println(toReturn);
	}
	
	

}
