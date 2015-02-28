package grailgames;

class PageRobin extends Cowardly{
	
	/**
	 * Constructs a PageRobin
	 *
	 */
	PageRobin(Player p) {
		super("Page Robin",p,60,60,0,"Squeal",20,0);
	}
	
	@Override 
	public String evolve() {
		Dueler levelUp = new SquireRobin(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP- this.currentHP); 
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";
		
	}
	
}

