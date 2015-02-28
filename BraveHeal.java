package grailgames;

class BraveHeal extends HolyHealthPotion{
	public BraveHeal() {
		super("Brave Heal");
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkBrave();
	}


}
