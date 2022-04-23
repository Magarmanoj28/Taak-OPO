package breakout;

import java.awt.Color;
import java.awt.SystemColor;

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
class NormalBlockState extends BlockState{

	public NormalBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.red;
	}
	
}
class SturdyBlockState extends BlockState{
	
	int i;
	public SturdyBlockState[] blocks;

	public SturdyBlockState(Rect location, int i) {
		super(location);
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.blue;
	}
	
}
class ReplicatorBlockState extends BlockState{

	public ReplicatorBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	
	}
	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.orange;
	}
	
}
class PowerupBallBlockState extends BlockState{

	public PowerupBallBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.white;
	}
	
}


