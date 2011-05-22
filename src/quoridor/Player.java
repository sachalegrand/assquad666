package quoridor;

import java.util.LinkedList;

/**
 * Player reprensents an abstract Player in the Game: it can be a human, or an AI.
 * 
 * <h2>Goals</h2>
 * <ul>
 * <li>Represents a Player, human or AI.</li>
 * </ul> 
 * 
 * <h2>Implementation</h2>
 * <ul>
 * <li>The variables that are common to all players are defined here (Pawn coordinates, name).</li>
 * <li>An abstract type() function is overridden in the specific extending classes to defines the type of Player this is:</li>
 * <li>Human or AI.</li>
 * </ul>
 * 
 * 
 * @author Sacha B�raud <sacha.beraud@gmail.com>
 *
 */

public abstract class Player {

	Point pawn;
	String name;
<<<<<<< HEAD
	int wall = 10;
=======
<<<<<<< HEAD
	int wall = 10;
=======
<<<<<<< HEAD
	int wall = 10;
=======
	int wall = 5;
>>>>>>> e40b95ce8ce496d58017adc35618be7aaccc0ee2
>>>>>>> b5baad8d03609dabe6d0ae6be2495cd908f2e2bb
>>>>>>> 466d01885739bfcfbf3674ddf9fa70ed11746740
	LinkedList<Point> positions = new LinkedList<Point>();
	
	/**
	 * A Point representing the coordinates of the Pawn of a Player.
	 * @return A Point representing the coordinates of the Pawn of a Player.
	 */
	public Point pawn(){
		return this.pawn;
	}
	
	/**
	 * A String, the name of a Player.
	 * @return A String, the name of a Player.
	 */
	public String name(){
		return this.name;
	}
	
	public LinkedList<Point> positions(){
		return this.positions;
	}
	/**
	 * A String, the type of Player this is.
	 * @return A String, the type of Player this is.
	 */
	public abstract String type();
	
	public int wallsLeft() {
		return wall;
	}
	
	public void deductWall() {
		wall--;
	}
	
}
