package breakout;

import java.awt.Color;
import java.awt.SystemColor;

public class PowerupBallBlockState extends BlockState {
	
	public PowerupBallBlockState(Rect location) {
		super(location);
		// TODO Auto-generated constructor stub
	}
			
	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		return SystemColor.white;
	}

	@Override
	public void setColor() {
		// TODO Auto-generated method stub
		getcolor();
		
	}

}

