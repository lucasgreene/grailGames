package grailgames;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Util class contains string parsers used by Player class and Trainer class
 * @author LUke
 *
 */
class Util {
	
	/**
	 * Parses the given card name and returns the associated card, 
	 * with the given player as input
	 * @param p - the player whose turn it is
	 * @param cardName -  the String of the card name to be parsed
	 * @return
	 * @throws Exception
	 */
	public static Card parse(Player p, String cardName) throws Exception{
		Card card = null;

		if (cardName.equals("Page Robin")) {
			card = new PageRobin(p);
		} else if (cardName.equals("Peasant Merek")) {
			card = new PeasantMerek(p);
		} else if (cardName.equals("Page Lancelot")) {
			card = new PageLancelot(p);
		} else if (cardName.equals("Peasant Concorde")) {
			card = new PeasantConcorde(p);
		} else if (cardName.equals("Page Galahad")) {
			card = new PageGalahad(p);
		} else  if (cardName.equals("Peasant Rowan")) {
			card = new PeasantRowan(p);
		} else if (cardName.equals("Anthrax Asylum")) {
			card = new AnthraxAsylum(p);
		} else if (cardName.equals("Cowardly Health")) {
			card = new CowardlyHeal(p);
		} else if (cardName.equals("Pure Health")) {
			card = new PureHeal(p);
		} else if (cardName.equals("Brave Health")) {
			card = new BraveHeal(p);
		} else if (cardName.equals("Jousting Practice")) {
			card = new JoustingPractice(p);
		} else if (cardName.equals("Camelot Reinforcements")) {
			card = new CamelotReinforcements(p);
		} else if (cardName.equals("Status Advance"))  {
			card = new StatusAdvance(p);
		} else if (cardName.equals("Boy Arthur")) {
			card = new BoyArthur(p);
		} else if (cardName.equals("Peasant Patsy")) {
			card = new PeasantPatsy(p);
		} else if (cardName.equals("Bridge of Death")) {
			card = new BridgeDeath(p);
		} else if (cardName.equals("Royal Health")) {
			card = new RoyalHeal(p);
		} else {
			throw new Exception("Can't read card deck");
		}

		return card;			
	}
	
	
	/**
	 * Parses and manages all commands that can be called on the start of a turn
	 * @param p - the player whose turn it is
	 * @param iStream - the BufferedReader associated with the Game
	 * @throws IOException
	 */
	public static void turnInput(Player p, BufferedReader iStream) throws IOException {
		
		String errorMessage = "Please input one of: print hand;" +
				" print field; switch #; play #; attack; pass;" ;
		boolean turnOver = false;
		while (!turnOver) {
			String s = iStream.readLine();
			String[] toks = s.split(" ");
			
			if (toks.length == 1) {
				if (toks[0].equals("attack")) {
					p.attack();
					turnOver = true;
				} else if (toks[0].equals("pass")) {
					p.pass();
					turnOver = true;
				} else {
					System.out.println(errorMessage);
				}
				
			} else if (toks.length == 2) {
				if (toks[0].equals("print") && toks[1].equals("hand")) {
					p.printHand();
				} else if (toks[0].equals("print") && toks[1].equals("field")) {
					p.printField();
				} else if (toks[0].equals("switch")) {
					try {
						int pos = Integer.parseInt(toks[1]);
						p.switchDuelers(pos);
					} catch (NumberFormatException e) {
						System.out.println(errorMessage);
					}
				} else if (toks[0].equals("play")) {
					try {
						int pos = Integer.parseInt(toks[1]);
						if (pos > p.hand.size()) {
							System.out.println(errorMessage);
							
						} else {
							p.play(pos);
						}	
					} catch (NumberFormatException e) {
						System.out.println(errorMessage);
					}
				} else {
					System.out.println(errorMessage);
				}
				
			} else {
				System.out.println(errorMessage);
			}
		}

	}
	
	/**
	 * Manages and parses all input associated with trainer's Play method
	 * Returns an int that specifies the index of home or away's field 
	 * @param iStream - BufferedReader associated with the Game
	 * @return
	 * @throws IOException
	 */
	public static int playInput(BufferedReader iStream) throws IOException {
		String playMessage = "Select a Dueler:\n" + 
							"0 for the battling Duelers, 1-6 for the bench ";
		String errorMessage = "Invalid input";
		System.out.println(playMessage);
		while (true) {
			String s = iStream.readLine();
			try {
				int pos = Integer.parseInt(s);
				if (pos <= 6 && pos >= 0) {
					return pos;
				} else {
					System.out.println(errorMessage);
					System.out.println(playMessage);
				}
			} catch (NumberFormatException e) {
				System.out.println(errorMessage);
				System.out.println(playMessage);
			}
	    }
	
	}
}
