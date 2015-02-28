package grailgames;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Game {
	
	Player p1;
	Player p2;
	private int turn = 1;
	private Card[] field1 = new Card[]{null,null,null,null,null,null,null};
	private Card[] field2 = new Card[]{null,null,null,null,null,null,null};
	private boolean gameOver = false;
	
	public Game(Player player1, Player player2) {
		this.p1 = player1;
		this.p2 = player2;
		this.p1.game = this;
		this.p2.game = this;
		
	}
	
	private void nextTurn() {
		this.turn *= -1;
	}
	
	public void startGame() throws IOException, Exception {
		for (int i=0; i<6; i++) {
			this.p1.draw();
			this.p2.draw();

		}

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			if (gameOver) {
				break;
			}
			p1.turn(input);
			if (gameOver) {
				break;
			}
			p2.turn(input);
			gameOver = true;
		}
		
		System.out.println("Games over!");
		

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
	    } 

	    */
		
		try {
			String n1 = "Luke";
			String n2 = "Tim";
			String d1 = "src/grailgames/DeckPreExtension.txt";
			String d2 = d1;
			Player p1 = new Player(n1, d1, null);
			Player p2 = new Player(n2, d2, null);
			Game game = new Game(p1,p2);
			game.startGame();

	    } catch (IOException e) {
	    	System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
