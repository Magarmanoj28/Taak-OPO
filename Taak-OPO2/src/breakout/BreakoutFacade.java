package breakout;

import java.awt.Color;
import java.awt.SystemColor;
import java.util.Arrays;

//No documentation required for this class
public class BreakoutFacade {
	public PaddleState createNormalPaddleState(Point center) {
		return new PaddleState(center);
	}

	public Ball createNormalBall(Point center, int diameter, Vector initBallVelocity) {

		return new NormalBall(new Circle(center, diameter), initBallVelocity);
	}

	public Ball createSuperchargedBall(Point center, int diameter, Vector initBallVelocity, int lifetime) {
		
		return new SuperChargedBall(new Circle(center, diameter), initBallVelocity, lifetime);
	}

	public BreakoutState createBreakoutState(Ball[] balls, BlockState[] blocks, Point bottomRight,
			PaddleState paddle) {
		return new BreakoutState(Arrays.stream(balls).filter(x -> x != null).toArray(Ball[]::new),
				 Arrays.stream(blocks).filter(x -> x != null).toArray(BlockState[]::new),
				 bottomRight, paddle);
	}

	public BlockState createNormalBlockState(Point topLeft, Point bottomRight) {
		return new NormalBlockState(new Rect(topLeft, bottomRight));
	}

	public BlockState createSturdyBlockState(Point topLeft, Point bottomRight, int i) {
		return new SturdyBlockState(new Rect(topLeft, bottomRight),i);
		
	}

	public BlockState createReplicatorBlockState(Point topLeft, Point bottomRight) {
		return new ReplicatorBlockState(new Rect(topLeft, bottomRight));
	}

	public BlockState createPowerupBallBlockState(Point topLeft, Point bottomRight) {
		return new PowerupBallBlockState(new Rect(topLeft, bottomRight));
	}

	public Color getColor(PaddleState paddle) {
		return paddle.getColor();
	}

	public Color getColor(Ball ball) {
		return ball.getColor();
	}

	public Rect getLocation(PaddleState paddle) {
		return paddle.getLocation();
	}

	public Point getCenter(Ball ball) {
		return ball.getCenter();
	}

	public int getDiameter(Ball ball) {
		return ball.getLocation().getDiameter();
	}

	public Ball[] getBalls(BreakoutState breakoutState) {
		return breakoutState.getBalls();
	}

	public Color getColor(BlockState block) {
		return block.getcolor();	
	}

	public Rect getLocation(BlockState block) {
		return block.getLocation();
	}
}
