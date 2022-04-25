package breakout;

public class SuperChargedBall extends Ball{

	public SuperChargedBall(Circle location, Vector velocity, int i) {
		super(location, velocity);
		print();
		
		// TODO Auto-generated constructor stub
	}
	public void print() {
		System.out.println("tere");
	}

	@Override
	public Ball hitBlock(Rect rect, boolean destroyed) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
