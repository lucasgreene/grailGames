package grailgames;

class BraveHeal extends HolyHealthPotion{
<<<<<<< Updated upstream
	public BraveHeal(Player p) {
		super("Brave Heal", p);
=======
	
	public BraveHeal() {
		super("Brave Heal");
>>>>>>> Stashed changes
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkBrave();
	}


}
