package breakout;

/**
 * Represents the state of a block in the breakout game.
 *
 * @immutable
 * @invar | getLocation() != null
 */
public abstract class BlockState {
	
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
	
}
class SturdyBlockState extends BlockState{

	public SturdyBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	
}
class ReplicatorBlockState extends BlockState{

	public ReplicatorBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	
}
class PowerupBallBlockState extends BlockState{

	public PowerupBallBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	
}


