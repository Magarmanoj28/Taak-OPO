package breakout;

import java.awt.Color;
import java.awt.SystemColor;

public class SturdyBlockState extends BlockState {
	
	public SturdyBlockState(Rect location, int i) {
		super(location);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Color getcolor() {
		// TODO Auto-generated method stub
		int i = 3;
		switch(i) {
		case 1:
			return SystemColor.red;
		case 2:
			return SystemColor.yellow;
		case 3:
			return SystemColor.blue;
		}
		return null;
	}
		
}


