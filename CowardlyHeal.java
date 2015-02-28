package grailgames;

class CowardlyHeal extends HolyHealthPotion{
	public CowardlyHeal(Player p) {
		super("Cowardly Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkCowardly();
	}
	
	public void play() { 
		System.out.println(effect((getFromHome(Util.playInput(p.iStream)))));
	}


}
