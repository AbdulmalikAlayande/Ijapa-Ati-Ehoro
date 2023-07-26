package turtleandhare.racers;

import java.math.BigInteger;

public class Racer {
	
	int DEFAULT_POSITION = BigInteger.ONE.intValue();
	private int position = DEFAULT_POSITION;
	
	public int getPosition() {
		return position;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int move(int move){
		return position;
	}
}
