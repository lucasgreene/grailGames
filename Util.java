package grailgames;

public class Util {
	
	
	public static Card parse(String cardName) throws Exception{
		Card card = null;
		
		if (cardName == "Page Robin"){
			card = new PageRobin();
		} else if (cardName == "Peasant Merek") {
			card = new PeasantMerek();
		} else if (cardName == "Page Lancelot") {
			card = new PageLancelot();
		} else if (cardName == "Peasant Concorde") {
			card = new PeasantConcorde();
		} else if (cardName == "Page Galahad") {
			card = new PageGalahad();
		} else  if (cardName == "Peasant Rowan") {
			card = new PeasantRowan();
		} else if (cardName == "Anthrax Asylum") {
			card = new AnthraxAsylum();
		} else if (cardName == "Cowardly Health") {
			card = new HolyHealthPotion("Cowardly");
		} else if (cardName == "Pure Health") {
			card = new HolyHealthPotion("Pure");
		} else if (cardName == "Brave Health") {
			card = new HolyHealthPotion("Brave");
		} else if (cardName == "Jousting Practice") {
			card = new JoustingPractice();
		} else if (cardName == "Camelot ReinForcements") {
			card = new CamelotReinforcements();
		} else if (cardName == "Status Advance")  {
			card = new StatusAdvance();
		} else if (cardName == "Boy Arthur") {
			card = new BoyArthur();
		} else if (cardName == "Peasant Patsy") {
			card = new PeasantPatsy();
		} else if (cardName == "Bridge of Death") {
			card = new BridgeDeath();
		} else if (cardName == "Royal Health") {
			card = new HolyHealthPotion("Royal");
		} else {
			throw new Exception("Error in card deck!");
		}

		return card;
			
	}

}
