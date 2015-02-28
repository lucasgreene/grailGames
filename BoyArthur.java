package grailgames;

class BoyArthur extends Royal {
	
	/**
	 * Constructs a BoyArthur 
	 *
	 */
	BoyArthur(Player p) {
		super("Boy Arthur",p,80,80,0,"Royal Charm", 20,0);
	}
	
	@Override 
	public String evolve() {
		Dueler levelUp = new PrinceArthur(this.currentHP, this.p);
		levelUp.currentHP = levelUp.maxHP - (this.maxHP- this.currentHP); 
		game.replace(levelUp, this.position);
		return this.name + " has evolved to " + levelUp.name + " !";
		
	}
	
	
}

