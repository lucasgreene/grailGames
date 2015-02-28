package grailgames;

import java.io.IOException;
import java.util.LinkedList;

/**
 * Player object
 * 
 * @author LUke
 *
 */
public class Player {

	String name;
	private String[] deck;
	Game game;
	private int deckIndex = 0;
	LinkedList<Card> hand = new LinkedList<Card>();

	/**
	 * Constructs the Player object
	 * 
	 * @param name
	 *            - name of player
	 * @param deckFileName
	 *            - location of deck file
	 * @param game
	 *            - pointer to Game object that the Player is playing, this is
	 *            set to null until the Game is initialized
	 * @throws IOException
	 */
	public Player(String name, String deckFileName, Game game)
			throws IOException {
		this.name = name;
		this.deck = GrailIO.getDeck(deckFileName);
		this.game = game;
	}

	/**
	 * Takes a card from the players deck, creates the Card associated with the
	 * string, and adds the Card object to the Players hand
	 */
	public void draw() {
		if (deckIndex < deck.length) {
			try {
				Card card = Util.parse(this, deck[deckIndex]);
				hand.addFirst(card);
				deckIndex++;
				System.out.println(name + " drew a card!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("Can't draw a card");
			}
		}
	}

	/**
	 * Manages the commands associated with a players turn
	 * 
	 * @throws IOException
	 */
	public void turn() throws IOException {
		System.out.println(name + "'s turn");
		draw();
		Util.turnInput(this, game.getStream());

	}

	/**
	 * Prints the name of every card in players hand Called when user inputs:
	 * print hand
	 */
	public void printHand() {
		int i = 1;
		for (Card temp : this.hand) {
			System.out.println(Integer.toString(i) + " -> " + temp.name);
			i++;
		}
	}

	/**
	 * Calls the games attack method called when user inputs: attack
	 */
	public void attack() {
		game.attack();
	}

	/**
	 * Calls the games pass method called when user inputs: pass
	 */
	public void pass() {
		game.pass();

	}

	/**
	 * Calls games printField method called when user inputs: print field
	 */
	public void printField() {
		game.printField();

	}

	/**
	 * Calls the play method of the card located at pos in hand Removes the
	 * played card from the hand called when user inputs: play #
	 * 
	 * @param pos
	 * @param iStream
	 * @throws IOException
	 */
	public void play(int pos) throws IOException {
		Card toPlay = this.hand.remove(pos - 1);
		toPlay.play();
	}

	/**
	 * Calls the games homeSwitch method, which switches the positions 0 and pos
	 * in the homeField called when user inputs: switch #
	 * 
	 * @param pos
	 */
	public void switchDuelers(int pos) {
		game.homeSwitch(pos);
	}
}