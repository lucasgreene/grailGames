package grailgames;

class BraveHeal extends HolyHealthPotion{

	public BraveHeal(Player p) {
		super("Brave Heal", p);
	}
	public String effect(Dueler d) { 
		return d.name + " used " + this.name + "! /n" + d.drinkBrave();
	}
	
	public void play() { 
		System.out.println(effect((getFromHome(Util.playInput(p.iStream)))));
	}


}
