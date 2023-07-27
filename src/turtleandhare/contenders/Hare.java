package turtleandhare.contenders;

import turtleandhare.movetypes.HareMoveType;

import java.math.BigInteger;

public class Hare extends Contender {
	
	
	int position = BigInteger.ONE.intValue();
	
	public int getPosition() {
		return position;
	}
	
	public int move(int numberOfMoves){
		if (numberOfMoves < BigInteger.valueOf(3).intValue())
			move(HareMoveType.SLEEP);
		else if (numberOfMoves < BigInteger.valueOf(5).intValue() && numberOfMoves > BigInteger.valueOf(2).intValue())
			move(HareMoveType.BIG_HOP);
		else if (numberOfMoves == BigInteger.valueOf(5).intValue()) {
			move(HareMoveType.BIG_SLIP);
		}
		else if (numberOfMoves > BigInteger.valueOf(5).intValue() && numberOfMoves < BigInteger.valueOf(9).intValue()) {
			move(HareMoveType.SMALL_HOP);
		}
		else if (numberOfMoves == 9 || numberOfMoves == 10) {
			move(HareMoveType.SMALL_SLIP);
		}
		return position;
	}
	
	public void move(HareMoveType moveType) {
		if (moveType == HareMoveType.SLEEP)
			position = DEFAULT_POSITION;
		else if (moveType == HareMoveType.BIG_HOP) {
			position += BigInteger.valueOf(9).intValue();
		}
		else if (moveType == HareMoveType.BIG_SLIP) {
			position -= BigInteger.valueOf(12).intValue();
			if (position < DEFAULT_POSITION)
				position = DEFAULT_POSITION;
		}
		else if (moveType == HareMoveType.SMALL_HOP) {
			position++;
		} else if (moveType == HareMoveType.SMALL_SLIP) {
			position -= BigInteger.TWO.intValue();
			if (position < DEFAULT_POSITION)
				position = DEFAULT_POSITION;
		}
	}
}
