package turtleandhare.racers;

import turtleandhare.movetypes.TortoiseMoveType;

import java.math.BigInteger;

public class Tortoise extends Racer{
	
	private int position = BigInteger.ONE.intValue();
	
	public int getPosition() {
		return position;
	}
	
	
	public void move(TortoiseMoveType moveType) {
		if (moveType == TortoiseMoveType.FAST_PLOD)
			position += BigInteger.valueOf(3).intValue();
		else if (moveType == TortoiseMoveType.SLIP) {
			position -= BigInteger.valueOf(6).intValue();
			if (position < BigInteger.ONE.intValue()) position = DEFAULT_POSITION;
		}
		else position += 1;
	}
}
