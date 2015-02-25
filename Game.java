package grailgames;

import java.io.IOException;

public class Game {
	
	Player p1;
	Player p2;
	public Game(Player player1, Player player2) {
		this.p1 = player1;
		this.p2 = player2;
		
	}
	
	public void startGame() {
		this.p1.draw();
		this.p2.draw();
		
		
	}
	
 
	
	
	
	
	
	public static void main(String[] args) {

		/*
		try {
			Player p1 = new Player(args[0], args[1]);
			Player p2 = new Player(args[1], args[2]);
	    	System.out.println(p1.name);
	    	System.out.println(p2.name);
	    	System.out.println(p1.deck);
	    } catch (IOException e) {
	    	System.out.println(e.getMessage());
	    } finally {

	    }
	    */
		
		try {
			String n1 = "Luke";
			String n2 = "Tim";
			String d1 = "src/grailgames/DeckPreExtension.txt";
			String d2 = d1;
			Player p1 = new Player(n1, d1);
			Player p2 = new Player(n2, d2);
			Game game = new Game(p1,p2);
			game.startGame();

	    } catch (IOException e) {
	    	System.out.println(e.getMessage()+ "\nInvalid Deck Name");

		
		}
	}
}
