package grailgames;

import java.io.BufferedReader;

public interface Communicate {
	/**
	 * This returns the input buffered reader to be used 
	 * by everything that interacts with the game state 
	 * and needs input
	 * @return
	 */
	BufferedReader getStream();

}
