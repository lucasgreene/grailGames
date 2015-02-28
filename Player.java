package grailgames;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;

public class Player {
	
	String name;
	String[] deck;
	Game game;
	private int deckIndex = 0;
	LinkedList<Card> hand = new LinkedList<Card>();
	BufferedReader iStream = game.iStream;
	public Player(String name, String deckFileName, Game game) throws IOException {
		this.name = name;
		this.deck = GrailIO.getDeck(deckFileName);	
		this.game = game;

		
	}
	
	public void draw() {
		if (deckIndex < deck.length) {
			try {
				Card card = Util.parse(this, deck[deckIndex]);
				hand.addFirst(card);
				deckIndex ++;
				System.out.println(name + " drew a card!");
			} catch (Exception e) {
				System.out.println("Error in card deck");
			}
		}
	}
	
	public void turn() throws IOException {
		System.out.println(name + "'s turn");
		draw();
        Util.turnInput(this, iStream);

				
	}
	
	public void printHand() {
		int i = 1;
		for (Card temp : this.hand) {
			System.out.println(Integer.toString(i) + " -> " + temp.name);
			i++;
		}
	}
	

		
	public void attack() {
		
		
	}
	
	public void pass() {
		
	}
	
	public void printField() {
		game.printField();
		
	}
	
	public void play(int pos, BufferedReader iStream) throws IOException {
		Card toPlay = this.hand.remove(pos-1);
		toPlay.play();
	}
	
	public void switchDuelers(int pos) {
	
	}
}