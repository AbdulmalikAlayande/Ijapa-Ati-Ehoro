package turtleandhare.contenders;

import turtleandhare.movetypes.TortoiseMoveType;

import java.math.BigInteger;

public class Tortoise extends Contender {
	
	private int position = BigInteger.ONE.intValue();
	
	public int getPosition() {
		return position;
	}
	
	public int move(int move){
		if (move < BigInteger.valueOf(6).intValue())
			move(TortoiseMoveType.FAST_PLOD);
		else if (move == 6 || move == 7)
			move(TortoiseMoveType.SLIP);
		else if (move > 7 && move < 11)
			move(TortoiseMoveType.SLOW_PLOD);
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
