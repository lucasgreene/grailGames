package grailgames;

class PureHeal extends HolyHealthPotion{
	public PureHeal() {
		super("Pure Heal");
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkPure();
	}


}
