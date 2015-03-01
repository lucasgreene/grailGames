package grailgames;

public class Tests {

	public static void main(String[] args) {

		try {
			// Create Players
			Player p1 = new Player("P1",
					"src/grailgames/DeckPostExtension.txt", null);
			Player p2 = new Player("P2",
					"src/grailgames/DeckPostExtension.txt", null);
			System.out.println(p1.name.equals("P1"));
			// Create a Game
			Game g = new Game(p1, p2);
			// Check that reference to game properly set during instantiation
			System.out.println(p1.game == g);
			System.out.println(p2.game == g);
			// Create some Cards
			Card anthrax = new AnthraxAsylum(p1);
			Card boy = new BoyArthur(p2);
			BraveHeal braveHeal = new BraveHeal(p1);
			Card bridge = new BridgeDeath(p1);
			// Test Camelot Reinforcements
			Card camelot = new CamelotReinforcements(p2);
			System.out.println(p2.hand.size() == 0);
			camelot.play();
			System.out.println(p2.hand.size() == 3);
			// Check Dueler's stat attributes
			Dueler ccConcorde = new CcConcorde(30, p2);
			System.out.println(ccConcorde.currentHP == 30);
			System.out.println(ccConcorde.AP == 30);
			System.out.println(ccConcorde.XP == 0);
			Dueler ccPatsy = new CcPatsy(10, p1);
			Dueler ccRowan = new CcRowan(30, p1);
			ccRowan.play();
			// Check memory reference from dueler.play which should
			// now reside in homeField[0]
			System.out.print(g.getFromHome(0) == ccRowan);
			RoyalHeal rHeal = new RoyalHeal(p2);
			Dueler prince = new PrinceArthur(0, p1);
			// Check that matching healing works
			rHeal.effect(prince);
			System.out.println(prince.currentHP == 30);
			// Check to non-matching healing works
			braveHeal.effect(prince);
			System.out.println(prince.currentHP == 40);
			Card jPractice = new JoustingPractice(p1);
			ccRowan.attack(ccPatsy);
			System.out.println(ccPatsy.currentHP == -10);

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}
