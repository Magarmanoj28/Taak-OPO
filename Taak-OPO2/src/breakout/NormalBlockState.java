package breakout;

import java.awt.Color;
import java.awt.SystemColor;

public class NormalBlockState extends BlockState {
	public NormalBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.red;
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ball TypeBall(Ball balls, Circle location, Vector velocity) {
		balls.bounceOn(getLocation());
		NormalBall r = new NormalBall(location,velocity);
		return r.hitBlock(getLocation(), false);
	}

}
