package grailgames;

/**
 * Class for testing the game
 * 
 * @author LUke
 *
 */
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
			BoyArthur boy = new BoyArthur(p1);
			Dueler ccPatsy = new CcPatsy(10, p1);
			// Test getFromHome references to homeField and dueler.play
			boy.play();
			ccPatsy.play();
			System.out.println(g.getFromHome(0) == boy);
			System.out.println(g.getFromHome(1) == ccPatsy);
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
			Dueler ccRowan = new CcRowan(30, p1);
			RoyalHeal rHeal = new RoyalHeal(p2);
			Dueler prince = new PrinceArthur(0, p1);
			// Check that matching healing works
			rHeal.effect(prince);
			System.out.println(prince.currentHP == 30);
			// Check to non-matching healing works
			BraveHeal braveHeal = new BraveHeal(p1);
			braveHeal.effect(prince);
			System.out.println(prince.currentHP == 40);
			// check anthrax full heal
			AnthraxAsylum anthrax = new AnthraxAsylum(p1);
			anthrax.effect(prince);
			System.out.println(prince.currentHP == 120);
			// Test jousting practice +20 HP
			JoustingPractice jPractice = new JoustingPractice(p1);
			jPractice.effect(prince);
			System.out.println(prince.currentHP == 140);
			System.out.println(prince.maxHP == 140);
			// Test attack
			ccRowan.attack(ccPatsy);
			System.out.println(ccPatsy.currentHP == -10);
			// Test next turn
			g.nextTurn();
			prince.play(); // Should go to the attack position of new homeField
							// which is now p2's field
			System.out.println(g.getFromHome(0) == prince);
			SquireRobin sRobin = new SquireRobin(50, p2);
			sRobin.play();
			// Switch fields again
			g.nextTurn(); // now prince is in the attack position of enemyField
			// Test BridgeDeath
			BridgeDeath bridge = new BridgeDeath(p1);
			bridge.effect(1); // switches prince and sRobin
			System.out.println(g.getFromAway(0) == sRobin);
			System.out.println(g.getFromAway(1) == prince);
			// Test Arthur special power
			KingArthur king = new KingArthur(p1, 100);
			king.attack(prince);
			System.out.println(king.currentHP == 40);
			// Check that sRobin has been banished from enemy field
			System.out.println(g.getFromAway(0) == null);
			// Test robin special power
			KnightRobin robin = new KnightRobin(100, p2, 0);
			prince.attack(robin);
			System.out.println(robin.currentHP == 100);
			robin.arena = 3;
			prince.attack(robin);
			System.out.println(robin.currentHP == 60);
			// Test Lancelot special power
			KnightLancelot lance = new KnightLancelot(60, p1);
			System.out.println(lance.AP == 50);
			lance.attack(robin);
			System.out.println(lance.AP == 55);
			// Test Galahad special power
			Dueler gal = new KnightGalahad(60, p2);
			gal.play(); // on the bench
			g.homeSwitch(2); // Test switch and places galahad in attack
			System.out.println(ccPatsy.currentHP == -10);
			gal.pass();
			System.out.println(ccPatsy.currentHP == -5);
			gal.attack(king);
			System.out.println(ccPatsy.currentHP == 0);
			// Test Status Advance
			StatusAdvance up = new StatusAdvance(p2);
			boy.XP = 5;
			up.effect(boy); // Now we check if there is an instance of
							// PrinceArthur
							// where boy was in homeField
			Dueler leveled = g.getFromHome(2);
			System.out.println((leveled instanceof PrinceArthur));

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}

}
