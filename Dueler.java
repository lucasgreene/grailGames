package grailgames;

import java.io.IOException;

abstract class Dueler extends Card {
	int maxHP;
	int currentHP;
	int XP;
	int turn;
	String attackName;
	int AP;
	int arena; 
	int position;
	
	/**
	 * Constructs a new dueler 
	 *
	 *@param name - name of the dueler
	 *@param maxHP - the maximum hit points of the dueler 
	 *@param currentHP - the current hit points of the dueler
	 *@param XP - the amount of experience points
	 *@param attackName - the name of the dueler's attack 
	 *@param AP - the amount of attack points of the dueler's attack
	 *@param arena - the amount of consecutive times spent in arena 
	 */
	
	Dueler(String name, Player p, int maxHP, int currentHP, int XP, String attackName, int AP, int arena) {
		super(name, p);
		this.maxHP = maxHP;
		this.currentHP = currentHP;
		this.XP = XP;
		this.attackName = attackName;
		this.AP = AP;
		this.arena = arena;
	}
	
	@Override 
	public String toString() {
		return this.name + ": " + this.currentHP + "/" +
	this.maxHP + "  Attack Power :" + this.AP + "  XP: " + this.XP;
	}
	
	/**
	 * Decreases the HP of this dueler when attacked by a cowardly dueler
	 * 
	 *@param d - the cowardly dueler that this dueler is being attacked by
	 * 
	 *@return a string indicating that this dueler took a certain amount of damage
	 *
	 */
	public String attackedByCowardly(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	/**
	 * Decreases the HP of this dueler when attacked by a brave dueler
	 * 
	 *@param d - the brave dueler that this dueler is being attacked by
	 * 
	 *@return a string indicating that this dueler took a certain amount of damage
	 *
	 */
	public String attackedByBrave(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
		
	}
	
	/**
	 * Decreases the HP of this dueler when attacked by a pure dueler
	 * 
	 *@param d - the pure dueler that this dueler is being attacked by
	 * 
	 *@return a string indicating that this dueler took a certain amount of damage
	 *
	 */
	public String attackedByPure(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
	}
	
	/**
	 * Decreases the HP of this dueler when attacked by a royal dueler
	 * 
	 *@param d - the royal dueler that this dueler is being attacked by
	 * 
	 *@return a string indicating that this dueler took a certain amount of damage
	 *
	 */
	public String attackedByRoyal(Dueler d) { 
		int damage = d.AP;
		this.currentHP = this.currentHP - damage; 

		return this.name + " took " + damage + " damage.";
		
	}
	
	/**
	 * Decreases the HP of a dueler that this dueler is attacking
	 * 
	 *@param d - the dueler that this dueler is attacking
	 * 
	 *@return a string indicating the attack that this dueler used
	 *
	 */
	public String attack(Dueler d) {
		d.currentHP = d.currentHP - this.AP;
		return this.name + " used " + this.attackName +"!";
	}
	
	/**
	 * Evolves a dueler or does not if it cannot be advanced
	 * 
	 *@return a string indicating whether or not the dueler was advanced
	 *
	 */
	public String evolve() {
		return this.name + " cannot be advanced.";
		
	}
	
	public String heal(int HP) {
		int heal = HP;
		int room = this.maxHP - this.currentHP;
		if (room < heal) {
			heal = room;
		} 
		this.currentHP = heal + this.currentHP;
		return this.name + " recovered " + heal + "HP!";
		
	}
	
	/**
	 * Increases the HP of this player
	 * 
	 *@return a string indicating the amount of HP this dueler gained
	 *
	 */
	public String drinkPure() {
		return heal(10);
	}
	
	/**
	 * Increases the HP of this player
	 * 
	 *@return a string indicating the amount of HP this dueler gained
	 *
	 */
	public String drinkBrave() {
		return heal(10);
	}
	
	/**
	 * Increases the HP of this player
	 * 
	 *@return a string indicating the amount of HP this dueler gained
	 *
	 */
	public String drinkRoyal() {
		return heal(10);
	}
	
	/**
	 * Increases the HP of this player
	 * 
	 *@return a string indicating the amount of HP this dueler gained
	 *
	 */
	public String drinkCowardly() {
		return heal(10);
	}
	
	public void pass() { 
		
	}
	
	public void play() throws IOException{ 
		this.p.game.place(this);
		if (this.position == 0) {
			System.out.println(this.name + " has been placed in the arena!");
		} 
		
		System.out.println(this.name + " has been placed on the bench!");
		
		
	}
	
	


}
