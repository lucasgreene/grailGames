package grailgames;

class KnightRobin extends Cowardly{
	
	/**
	 * Constructs a KnightRobin
	 *
	 *@param currentHP - the current hit points of this KnightRobin
	 */
	KnightRobin(int currentHP, Player p) {
		super("Knight Robin", p, 120,currentHP,0,"Camouflage", 60,0);
	}
	
	@Override
	public String attackedByBrave(Dueler d) { 
		int damage = 0;
		if (this.arena < 2) {
			return "Knight Robin is invisible. He cannot be attacked.";
		} else if (d.AP >= 20) {
			damage = d.AP -20;
			this.currentHP = this.currentHP - damage; 
		} 
		
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}
		
		return "It's not very effective ... \n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByPure(Dueler d) { 
		int damage = d.AP + 20;
		this.currentHP = this.currentHP - damage;
		if (this.arena < 2) {
			return "Knight Robin is invisible. He cannot be attacked.";
		} else if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}

		return "It's super effective! \n" + this.name + " took " + damage + " damage.";
	}
	
	@Override
	public String attackedByRoyal(Dueler d) { 
		int damage = d.AP;
		if (this.arena < 2) {
			return "Knight Robin is invisible. He cannot be attacked.";
		} 
		this.currentHP = this.currentHP - damage;
	
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}
		return this.name + " took " + damage + " damage.";
		
	}
	@Override
	public String attackedByCowardly(Dueler d) { 
		int damage = d.AP;
		if (this.arena < 2) {
			return "Knight Robin is invisible. He cannot be attacked.";
		} 
		this.currentHP = this.currentHP - damage;
	
		if (this.currentHP <= 0) {
			game.banish();
			return this.name + " has been exiled from castle camelot!";
		}
		return this.name + " took " + damage + " damage.";
		
	}
	
	public void pass() {
		this.arena = this.arena + 1;
	}

}
