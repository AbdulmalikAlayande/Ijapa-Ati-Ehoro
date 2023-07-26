package turtleandhare;

import java.math.BigInteger;

public class Tortoise {
	
	private int position = 1;
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void move(TortoiseMoveType moveType) {
		if (moveType == TortoiseMoveType.FAST_PLOD)
			position += BigInteger.valueOf(3).intValue();
		else if (moveType == TortoiseMoveType.SLIP) {
			position -= BigInteger.valueOf(6).intValue();
			if (position < BigInteger.ONE.intValue()) position = 1;
		}
		else position += 1;
	}
}
