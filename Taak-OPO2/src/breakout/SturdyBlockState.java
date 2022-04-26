package breakout;

import java.awt.Color;
import java.awt.SystemColor;

public class SturdyBlockState extends BlockState {
	
	int index=3;
	public SturdyBlockState(Rect location, int i) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		
		switch(index) {
		case 1:
			return SystemColor.red;
		case 2:
			return SystemColor.yellow;
		case 3:
			return SystemColor.blue;
		}
		return null;
	}
	@Override
	public void setColor() {
		index--;
		//getcolor();
	
		
	}

	@Override
	public Ball TypeBall(Ball balls, Circle location, Vector velocity) {
		balls.bounceOn(getLocation());
		NormalBall r = new NormalBall(location, velocity);
		return r.hitBlock(getLocation(), false);
	}
	
	
		
}


