package grailgames;

class RoyalHeal extends HolyHealthPotion{
	public RoyalHeal() {
		super("Royal Heal");
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkRoyal();
	}


}
