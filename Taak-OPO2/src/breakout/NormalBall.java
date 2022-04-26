package breakout;

public class NormalBall extends Ball {
	private Ball[] balls;
	private BlockState[] blocks;
	private Point bottomRight;
	private PaddleState paddle;

	public NormalBall(Circle location, Vector velocity) {
		super(location, velocity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Ball hitBlock(Rect rect, boolean destroyed) {
		// TODO Auto-generated method stub
		BreakoutState r = new BreakoutState(balls, blocks, bottomRight, paddle);
		for(int i =0; i < r.getBalls().length; ++i) {
			if(r.getBalls()[i]!= null) {
				r.getBalls()[i] = collide(r.getBalls()[i]);
				System.out.println("plz");
				
			}
		}
		return new NormalBall(getLocation(), getVelocity());
	}

	private Ball collide(Ball ball) {
		// TODO Auto-generated method stub
		BreakoutState r = new BreakoutState(balls, blocks, bottomRight, paddle);
		for(BlockState block : blocks) {
			Vector rs = ball.bounceOn(block.getLocation());
			if(rs != null) {
				r.removeBlock(block);
			}
			return new NormalBall(ball.getLocation(),rs);
		}
		return ball;
	}

}
