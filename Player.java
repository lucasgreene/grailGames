package grailgames;

import java.io.IOException;
import java.util.LinkedList;

public class Player {
	
	String name;
	String[] deck;
	private int deckIndex = 0;
	LinkedList<Card> hand = new LinkedList<Card>();
	
	public Player(String name, String deckFileName) throws IOException {
		this.name = name;
		this.deck = GrailIO.getDeck(deckFileName);	

		
	}
	
	public void draw() {
		if (deckIndex < deck.length) {
			try {
				Card card = Util.parse(deck[deckIndex]);
				hand.addFirst(card);
				deckIndex ++;
				System.out.println(name + " drew a card!");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void printHand() {
		int i = 1;
		for (Card temp : this.hand) {
			System.out.println(Integer.toString(i) + " -> " + temp.name);
			i++;
		}
	}
	
	public void turnMessage() {
		System.out.println(name + "'s turn");
	}
		
	
}
