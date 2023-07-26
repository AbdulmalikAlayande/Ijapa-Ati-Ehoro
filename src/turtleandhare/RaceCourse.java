package turtleandhare;

import turtleandhare.contenders.Contender;

public class RaceCourse {
	
	Contender[] contenders;
	int[] squares = new int[71];
	
	public void setContenders(Contender[] racers) {
		this.contenders = racers;
	}
	
	public Contender[] getContenders() {
		return contenders;
	}
	
	public int[] getSquares() {
		return squares;
	}
	
	public void setTrackReady() {
	
	}
	
	public void race(){
	
	}
}
