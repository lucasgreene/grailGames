package grailgames;

public class Util {
	
	
	public static Card parse(String cardName) throws Exception{
		Card card = null;

		if (cardName.equals("Page Robin")) {
			card = new PageRobin();
		} else if (cardName.equals("Peasant Merek")) {
			card = new PeasantMerek();
		} else if (cardName.equals("Page Lancelot")) {
			card = new PageLancelot();
		} else if (cardName.equals("Peasant Concorde")) {
			card = new PeasantConcorde();
		} else if (cardName.equals("Page Galahad")) {
			card = new PageGalahad();
		} else  if (cardName.equals("Peasant Rowan")) {
			card = new PeasantRowan();
		} else if (cardName.equals("Anthrax Asylum")) {
			card = new AnthraxAsylum();
		} else if (cardName.equals("Cowardly Health")) {
			card = new HolyHealthPotion("Cowardly Health");
		} else if (cardName.equals("Pure Health")) {
			card = new HolyHealthPotion("Pure Health");
		} else if (cardName.equals("Brave Health")) {
			card = new HolyHealthPotion("Brave Health");
		} else if (cardName.equals("Jousting Practice")) {
			card = new JoustingPractice();
		} else if (cardName.equals("Camelot Reinforcements")) {
			card = new CamelotReinforcements();
		} else if (cardName.equals("Status Advance"))  {
			card = new StatusAdvance();
		} else if (cardName.equals("Boy Arthur")) {
			card = new BoyArthur();
		} else if (cardName.equals("Peasant Patsy")) {
			card = new PeasantPatsy();
		} else if (cardName.equals("Bridge of Death")) {
			card = new BridgeDeath();
		} else if (cardName.equals("Royal Health")) {
			card = new HolyHealthPotion("Royal Health");
		} else {
			throw new Exception("Error in card deck!");
		}

		return card;
			
	}

}
