package breakout;

import java.awt.Color;
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
		return new BlockState(new Rect(topLeft, bottomRight));
	}

	public BlockState createSturdyBlockState(Point topLeft, Point bottomRight, int i) {
		// TODO
		return null;
	}

	public BlockState createReplicatorBlockState(Point topLeft, Point bottomRight) {
		// TODO
		return null;
	}

	public BlockState createPowerupBallBlockState(Point topLeft, Point bottomRight) {
		// TODO
		return null;
	}

	public Color getColor(PaddleState paddle) {
		// TODO
		return null;
	}

	public Color getColor(Ball ball) {
		// TODO
		return null;
	}

	public Rect getLocation(PaddleState paddle) {
		// TODO
		return null;
	}

	public Point getCenter(Ball ball) {
		// TODO
		return null;
	}

	public int getDiameter(Ball ball) {
		// TODO
		return -1;
	}

	public Ball[] getBalls(BreakoutState breakoutState) {
		// TODO
		return null;
	}

	public Color getColor(BlockState block) {
		// TODO
		return null;
	}

	public Rect getLocation(BlockState block) {
		// TODO
		return null;
	}
}
