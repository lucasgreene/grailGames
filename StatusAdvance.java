package grailgames;

class StatusAdvance extends Training {
	StatusAdvance(Player p) {
		super("Status Advance",p);
	}
	String effect(Dueler d) {
		if (d.XP >= 3) {
			return d.evolve();
		} else {
			return "This dueler is not yet experienced enough to advance.";
		}
	}
		
	@Override
	void play() {
		System.out.println(effect(getFromHome(util.PlayInput(p.iStream)));
			
	}
		
		

}
