package grailgames;

class StatusAdvance extends Training {
	StatusAdvance() {
		super("Status Advance");
	}
	String effect(Dueler d) {
		if (d.XP >= 3) {
			return d.evolve();
		} else {
			return "This dueler is not yet experienced enough to advance.";
		}
	}
}
