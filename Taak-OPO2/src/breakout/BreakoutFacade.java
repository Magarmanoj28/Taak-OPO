package breakout;

import java.awt.Color;
import java.awt.SystemColor;
import java.util.Arrays;

//No documentation required for this class
public class BreakoutFacade {
	public PaddleState createNormalPaddleState(Point center) {
		// TODO
		return new PaddleState(center);
	}

	public Ball createNormalBall(Point center, int diameter, Vector initBallVelocity) {
		// TODO
		return new NormalBall(new Circle(center, diameter), initBallVelocity);
	}

	public Ball createSuperchargedBall(Point center, int diameter, Vector initBallVelocity, int lifetime) {
		
		// TODO
		// new SuperChargedBall(new Circle(center, diameter), initBallVelocity, lifetime);//
		return null;
	}

	public BreakoutState createBreakoutState(Ball[] balls, BlockState[] blocks, Point bottomRight,
			PaddleState paddle) {
		// TODO
		return new BreakoutState(Arrays.stream(balls).filter(x -> x != null).toArray(Ball[]::new),
				 Arrays.stream(blocks).filter(x -> x != null).toArray(BlockState[]::new),
				 bottomRight, paddle);
	}

	public BlockState createNormalBlockState(Point topLeft, Point bottomRight) {
		// TODO
		return new NormalBlockState(new Rect(topLeft, bottomRight));
	}

	public BlockState createSturdyBlockState(Point topLeft, Point bottomRight, int i) {
		// TODO
		//return new SturdyBlockState(new Rect(topLeft, bottomRight),i);
		return null;
	}

	public BlockState createReplicatorBlockState(Point topLeft, Point bottomRight) {
		// TODO
		return new ReplicatorBlockState(new Rect(topLeft, bottomRight));
	}

	public BlockState createPowerupBallBlockState(Point topLeft, Point bottomRight) {
		// TODO
		return new PowerupBallBlockState(new Rect(topLeft, bottomRight));
	}

	public Color getColor(PaddleState paddle) {
		// TODO
		return SystemColor.cyan;
	}

	public Color getColor(Ball ball) {
		// TODO
	
		return SystemColor.blue;
	}

	public Rect getLocation(PaddleState paddle) {
		// TODO
		return paddle.getLocation();
	}

	public Point getCenter(Ball ball) {
		// TODO
		return ball.getCenter();
	}

	public int getDiameter(Ball ball) {
		// TODO
		return ball.getLocation().getDiameter();
	}

	public Ball[] getBalls(BreakoutState breakoutState) {
		// TODO
		return breakoutState.getBalls();
	}

	public Color getColor(BlockState block) {
		// TODO
		return SystemColor.red;
	}

	public Rect getLocation(BlockState block) {
		// TODO
		return block.getLocation();
	}
}
