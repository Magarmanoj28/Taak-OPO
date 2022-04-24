package breakout;

import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;

/**
 * Represents the state of a block in the breakout game.
 *
 * @immutable
 * @invar | getLocation() != null
 */
public abstract class BlockState {
	
	public abstract Color getcolor();
	
	/**
	 * @invar | location != null
	 */
	private final Rect location;

	/**
	 * Construct a block occupying a given rectangle in the field.
	 * @pre | location != null
	 * @post | getLocation().equals(location)
	 */
	public BlockState(Rect location) {
		this.location = location;
	}

	/**
	 * Return the rectangle occupied by this block in the field.
	 */
	public Rect getLocation() {
		return location;
	}
	
	
	
}




