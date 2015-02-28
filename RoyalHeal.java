package grailgames;

class RoyalHeal extends HolyHealthPotion{
	public RoyalHeal(Player p) {
		super("Royal Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkRoyal();
	}


}
