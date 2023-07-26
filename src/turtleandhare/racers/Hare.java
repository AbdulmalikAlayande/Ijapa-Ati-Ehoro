package turtleandhare.racers;

import turtleandhare.movetypes.HareMoveType;

public class Hare {
	
	int position = 1;
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public void move(HareMoveType moveType) {
		if (moveType == HareMoveType.SLEEP)
			position = 1;
	}
}
