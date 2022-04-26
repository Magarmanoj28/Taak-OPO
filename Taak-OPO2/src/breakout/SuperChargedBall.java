package breakout;

public class SuperChargedBall extends Ball{

	public SuperChargedBall(Circle location, Vector velocity, int i) {
		super(location, velocity);
		
		// TODO Auto-generated constructor stub
	}
	public Ball Super(Ball ball,Circle location, Vector velocity, int i) {
		
		return ball;

	}

	@Override
	public Ball hitBlock(Rect rect, boolean destroyed) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
