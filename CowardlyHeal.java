package grailgames;

class CowardlyHeal extends HolyHealthPotion{
	public CowardlyHeal() {
		super("Cowardly Heal");
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkCowardly();
	}


}
