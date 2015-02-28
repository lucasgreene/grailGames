package grailgames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {
	
	Player p1;
	Player p2;
	private int turn = 1;
	private Dueler[] homeField = new Dueler[]{null,null,null,null,null,null,null};
	private Dueler[] awayField = new Dueler[]{null,null,null,null,null,null,null};
	private boolean gameOver = false;
	BufferedReader iStream;
	
	public Game(Player player1, Player player2) {
		this.p1 = player1;
		this.p2 = player2;
		this.p1.game = this;
		this.p2.game = this;
		this.iStream = new BufferedReader(new InputStreamReader(System.in));
		
	}
	
	private void nextTurn() {
		this.turn *= -1;
		Dueler[] temp = homeField;
		homeField = awayField;
		awayField = temp;
	}
	
	public Dueler getFromHome(int i) {
		Dueler toReturn = homeField[i];
		return toReturn;
	}
	
	public void printFieldHelp(Dueler[] field) {
	
		System.out.print("Battle Position: " + field[0].toString());
		for (int i = 1; i < field.length; i++) {
			System.out.print(Integer.toString(i) + "        " + 
							    field[i].toString());
		}
	}
	public void printField() {
		String myName; 
		String enemyName;
		if (turn == 1) {
			myName = p1.name;
		    enemyName  = p2.name;
		} else {
			myName = p2.name;
			enemyName = p1.name;
		}
		System.out.println(myName + "'s Field:");
		printFieldHelp(this.homeField);
		System.out.println(enemyName + "'s Field");
		printFieldHelp(this.awayField);
		
		
	}
	
	public void place(Dueler dueler) {
		for (int i = 0; i < homeField.length; i++) {
			if (homeField[i] == null) {
				homeField[i] = dueler;
				dueler.position = i;
				break;  
			}
		}
			
	}
	
	public void replace(Card dueler, int i) {
		
	}
	
	public void galahadSpecial() {
		
	}
	
	public void awaySwitch(int i) {
		
	}
	
	private void incrementXP() {
		
	}
	
	public void banish() {
		
	}
	
	public void startGame() throws IOException, Exception {
		for (int i=0; i<6; i++) {
			this.p1.draw();
			this.p2.draw();

		}


		while (true) {
			p1.turn();
			if (gameOver) {
				break;
			}
			incrementXP();
			nextTurn();
			p2.turn();
			if (gameOver) {
				break;
			}
			incrementXP();
			nextTurn();
			gameOver = true;
		}
		iStream.close();
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
