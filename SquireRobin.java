package grailgames;

class SquireRobin extends Cowardly {
	
	/**
	 * Constructs a SquireRobin
	 *
	 *@param currentHP - the current hit points of this SquireRobin
	 */
	SquireRobin(int currentHP, Player p) {
		super("Squire Robin",p,100,currentHP,0,"Dash",30,0);
	}

	@Override 
	public String evolve() {
		Dueler levelUp = new KnightRobin(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP- this.currentHP); 
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";
		
	}

	
}
