package grailgames;

import java.io.BufferedReader;
import java.io.IOException;

class Util {
	
	
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

	
	public static boolean parseInput(Player p, BufferedReader iStream) throws IOException {
		String s = iStream.readLine();
		String[] toks = s.split(" ");
		String errorMessage = "Please input one of: print hand; print field;" +
									" switch #; play #; attack; pass;" ;
		
		if (toks.length == 1) {
			if (toks[0].equals("attack")) {
				p.attack();
				return true;
			} else if (toks[0].equals("pass")) {
				p.pass();
				return true;
			} else {
				System.out.println(errorMessage);
				return false;
			}
			
		} else if (toks.length == 2) {
			if (toks[0].equals("print") && toks[1].equals("hand")) {
				p.printHand();
				return true;
			} else if (toks[0].equals("print") && toks[1].equals("field")) {
				p.printField();
				return false;
			} else if (toks[0].equals("switch")) {
				try {
					int pos = Integer.parseInt(toks[1]);
					p.switchDuelers(pos);
					return true;
				} catch (NumberFormatException e) {
					System.out.println(errorMessage);
					return false;
				}
			} else if (toks[0].equals("play")) {
				try {
					int pos = Integer.parseInt(toks[1]);
					if (pos > p.hand.size()) {
						System.out.println(errorMessage);
						
					} else {
						p.play(pos);
					}	
					return false;
				} catch (NumberFormatException e) {
					System.out.println(errorMessage);
					return false;
				}
			} else {
				System.out.println(errorMessage);
				return false;
			}
			
		} else {
			System.out.println(errorMessage);
			return false;
		}
	}

}
