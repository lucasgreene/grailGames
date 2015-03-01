package grailgames;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Game object Takes as input two player objects
 * 
 * @author LUke
 *
 */
public class Game implements Communicate {

	private Player p1;
	private Player p2;
	private int turn = 1;
	private Dueler[] homeField = new Dueler[] { null, null, null, null, null,
			null, null };
	private Dueler[] awayField = new Dueler[] { null, null, null, null, null,
			null, null };
	private boolean gameOver = false;
	private BufferedReader iStream;

	/**
	 * Constructs the game class
	 * 
	 * @param player1
	 *            - a Player
	 * @param player2
	 *            - a Player
	 */
	public Game(Player player1, Player player2) {
		this.p1 = player1;
		this.p2 = player2;
		this.iStream = new BufferedReader(new InputStreamReader(System.in));
		this.p1.game = this;
		this.p2.game = this;

	}

	/**
	 * returns the BufferedReader being used by the Game
	 */
	public BufferedReader getStream() {
		return this.iStream;
	}

	/**
	 * Changes the state of the game to the next turn
	 */
	public void nextTurn() {
		this.turn *= -1;
		Dueler[] temp = homeField;
		homeField = awayField;
		awayField = temp;
	}

	/**
	 * Returns the Dueler in position i on the home field
	 * 
	 * @param i
	 * @return
	 */
	public Dueler getFromHome(int i) {
		Dueler toReturn = homeField[i];
		return toReturn;
	}

	/**
	 * Returns the Dueler in position i on the away field
	 * 
	 * @param i
	 * @return
	 */
	public Dueler getFromAway(int i) {
		Dueler toReturn = awayField[i];
		return toReturn;
	}

	/**
	 * Prints the names and positions of a field
	 * 
	 * @param field
	 */
	private void printFieldHelp(Dueler[] field) {
		String arenaPlayer;
		if (field[0] == null) {
			arenaPlayer = "Empty";
		} else {
			arenaPlayer = field[0].toString();
		}
		System.out.println("Battle Position: " + arenaPlayer);
		System.out.println("Bench: ");
		for (int i = 1; i < field.length; i++) {
			String out;
			if (field[i] != null) {
				out = (Integer.toString(i) + "        " + field[i].toString());
			} else {
				out = (Integer.toString(i) + "        Empty");
			}
			System.out.println(out);
		}
	}

	/**
	 * Prints both fields Called when user inputs: print field
	 */
	public void printField() {
		String myName;
		String enemyName;
		if (turn == 1) {
			myName = p1.name;
			enemyName = p2.name;
		} else {
			myName = p2.name;
			enemyName = p1.name;
		}
		System.out.println(myName + "'s Field:");
		printFieldHelp(this.homeField);
		System.out.println(enemyName + "'s Field");
		printFieldHelp(this.awayField);

	}

	/**
	 * Calls the attack method of the card in home team's arena If no Dueler in
	 * Home arena, prints message and passes If no Dueler in Away arena, and
	 * there is a Dueler in home, Changes gameOver to true to end the game
	 */
	public void attack() {
		if ((homeField[0] != null) && (homeField[0].XP > 0)) {
			if (awayField[0] != null) {
				homeField[0].attack(awayField[0]);
			} else {
				this.gameOver = true;
			}
		} else if ((homeField[0] != null) && (homeField[0].XP <= 0)) {
			System.out.println(homeField[0].name
					+ " isn't experienced enough to attck!");
		} else {
			System.out.println("No dueler in battle position");
		}
	}

	/**
	 * Calls the card in home positions pass method, if card in arena. All pass
	 * methods do nothing, except for Knight Galahad
	 */
	public void pass() {
		if (homeField[0] != null) {
			homeField[0].pass();
		}
	}

	/**
	 * Switches the Dueler (or null) of position i with the Dueler (or null) at
	 * position 0 Called when user inputs: switch #
	 * 
	 * @param i
	 */
	public void homeSwitch(int i) {
		Dueler tmp = homeField[0];
		homeField[0] = homeField[i];
		homeField[i] = tmp;
		if (homeField[0] != null) {
			homeField[0].position = 0;
			System.out.println(homeField[0].name + " was placed in the arena!");
		}
		if (homeField[i] != null) {
			homeField[i].position = i;
			System.out.println(homeField[i].name + " was placed on the bench!");
		}

	}

	/**
	 * places the input Dueler card in the first available spot on homeField
	 * 
	 * @param dueler
	 */
	public boolean place(Dueler dueler) {
		for (int i = 0; i < homeField.length; i++) {
			if (homeField[i] == null) {
				homeField[i] = dueler;
				homeField[i].position = i;
				if (i == 0) {
					System.out.println(dueler.name
							+ " was placed in the arena!");
				} else {
					System.out.println(dueler.name
							+ " was placed on the bench!");
				}
				return true;
			}
		}
		return false;
	}

	/**
	 * Replaces the Dueler at position i with the input Dueler Called when a
	 * Dueler advances status
	 * 
	 * @param dueler
	 * @param i
	 */
	public void replace(Dueler dueler, int i) {
		homeField[i] = dueler;
		if (dueler != null) {
			dueler.position = i;
		}
	}

	/**
	 * Galahad special power - increases all home bench HP Called every time
	 * Galahad attacks or passes, to signify the end of a turn in which Galahad
	 * is in the arena
	 */
	public void galahadSpecial() {
		for (int i = 1; i < homeField.length; i++) {
			if (homeField[i] != null) {
				homeField[i].heal(5);
			}
		}
		System.out.println("Galahad's special power is working...");
	}

	/**
	 * Switches Dueler in position i with Dueler in position 0 on awayField, if
	 * Dueler in position i not null Called by Bridge of Death
	 * 
	 * @param i
	 */
	public void bridgeOfdeath(int i) {
		if (awayField[i] != null) {
			Dueler tmp = awayField[i];
			awayField[i] = awayField[0];
			if (awayField[0] != null) {
				System.out.println(awayField[0].name
						+ " was placed on the bench!");
				awayField[i].position = i;
			}
			awayField[0] = tmp;
			awayField[0].position = 0;
			System.out.println(awayField[0].name + " was placed in the arena!");
		} else {
			System.out.println("No effect!");
		}
	}

	/**
	 * Increments the XP of all duelers on homeField Called after every turn
	 */
	private void incrementXP() {
		for (Dueler d : homeField) {
			if (d != null) {
				d.XP++;
			}
		}
	}

	/**
	 * banishes (removes) the player in the awayField arena
	 */
	public void banish() {
		awayField[0] = null;
	}

	/**
	 * Removes the player in homeField King Arthur is the only one who would
	 * call this
	 */
	public void suicide() {
		homeField[0] = null;
	}

	/**
	 * Starts the game by drawing 6 cards for each player, and then continues to
	 * cycle between p1 turn and p2 turn until gameOver = true
	 * 
	 * @throws IOException
	 * @throws Exception
	 */
	public void startGame() throws IOException, Exception {
		for (int i = 0; i < 6; i++) {
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
		}

		iStream.close();
		if (turn == 1) {
			System.out.println(p1.name + " attacked " + p2.name);
		} else {
			System.out.println(p2.name + " attacked " + p2.name);
		}
		System.out.println("Games over!");

	}

	public static void main(String[] args) {

		
		try {
			Player p1 = new Player(args[0], args[1], null);
			Player p2 = new Player(args[2],args[1],  null);
			Game game = new Game(p1, p2);
			game.startGame();

		} catch (IOException e) {
			System.out.println(e.getMessage() + "Input stream error");
		} catch (Exception e) {
			System.out.println(e.getMessage() + ": other exception");
		}
		
	}
}
