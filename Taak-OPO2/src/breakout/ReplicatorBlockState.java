package breakout;

import java.awt.Color;
import java.awt.SystemColor;

public class ReplicatorBlockState extends BlockState {
	
	public ReplicatorBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.green;
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ball TypeBall(Ball balls, Circle location, Vector velocity) {
		balls.bounceOn(getLocation());
		return new NormalBall(location,velocity);
	}


	


}


