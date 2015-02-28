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
		this.iStream = new BufferedReader(new InputStreamReader(System.in));
		this.p1.game = this;
		this.p2.game = this;
		
		
		
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
	
	public Dueler getFromAway(int i) {
		Dueler toReturn = awayField[i];
		return toReturn;
	}
	
	public void printFieldHelp(Dueler[] field) {
		String arenaPlayer;
		if (field[0] == null) {
			arenaPlayer = "Empty";
		} else {
			arenaPlayer = field[0].toString();
		}
		System.out.println("Battle Position: " + arenaPlayer);
		for (int i = 1; i < field.length; i++) {
			String out;
			if (field[i] != null) {
				out = (Integer.toString(i) + "        " + 
					    field[i].toString());
			} else {
				out = (Integer.toString(i) + "        Empty");
			}
			System.out.println(out);
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
	
	public void attack() {
		if ((homeField[0] != null) && (homeField[0].XP > 0)) {
			if (awayField[0] != null) {
				homeField[0].attack(awayField[0]);
			} else {
				this.gameOver = true;
			}
		} else if ((homeField[0] != null) && (homeField[0].XP <= 0)) {
			System.out.println(homeField[0].name + 
					" isn't experienced enough to attck!") ;
		} else {
			System.out.println("No dueler in battle position");
		}
	}
	
	public void pass() {
		if (homeField[0] != null) {
			homeField[0].pass();
		}
	}
	
	public void homeSwitch(int i) {
		Dueler tmp = homeField[0];
		homeField[0] = homeField[i];
		homeField[i] = tmp;
		if (homeField[0] != null) {
			homeField[0].position = 0;
			System.out.println(homeField[0].name + 
							" was placed in the arena!");
		}
		if (homeField[i] != null) {
			homeField[i].position = i;
			System.out.println(homeField[i].name + 
						" was placed on the bench!");
		}
		
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
	
	public void replace(Dueler dueler, int i) {
		homeField[i] = dueler;
		dueler.position = i;
		
	}
	
	public void galahadSpecial() {
		for (int i = 1; i < homeField.length; i++) {
			if (homeField[i] != null) {
				homeField[i].heal(5);
			}
		}
	}
	
	
	public void awaySwitch(int i) {
		if (awayField[i] != null) {
			Dueler tmp = awayField[i];
			awayField[i] = awayField[0];
			awayField[i].position = i;
			if (awayField[i] != null) {
				System.out.println(awayField[i].name + 
						" was placed on the bench!");
			}
			awayField[0] = tmp;
			awayField[0].position = 0;
			System.out.println(awayField[0].name + " was placed in the arena!");
		}
		
	}
	
	private void incrementXP() {
		for (Dueler d : homeField) {
			if (d != null) {
				d.XP ++;
			}
		}	
	}
	
	public void banish() {
		awayField[0] = null;
		System.out.println("Someone was banished");
	}
	
	public void startGame() throws IOException, Exception {
		for (int i=0; i<6; i++) {
			this.p1.draw();
			this.p2.draw();

		}


		while (true) {
			System.out.println("here");
			p1.turn();
			if (gameOver) {
				break;
			}
			System.out.println("asd");
			incrementXP();
			nextTurn();
			p2.turn();
			if (gameOver) {
				break;
			}
			incrementXP();
			nextTurn();
			//gameOver = true;
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
	    	System.out.println(e.getMessage() + "Input stream error");
		} catch (Exception e) {
			System.out.println(e.getMessage() + ": other exception");
		}
	}
}
