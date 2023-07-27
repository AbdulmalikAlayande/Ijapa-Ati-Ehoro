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
		while (thereIsNoWinnerYet()){
			for (Contender contender : contenders) {
				int racerMove = MovePercentageGenerator.generateMove(contender);
				contender.move(racerMove);
			}
			displayRaceCourse();
		}
	}
	
	private void displayRaceCourse() {
		for (Contender contender : contenders) {
			for (int indexj = 0; indexj < squares.length; indexj++) {
				if (contender.getPosition() == indexj)
					System.out.println(contender.getName());
				System.out.print("__");
			}
			System.out.println();
		}
	}
	
	private boolean thereIsNoWinnerYet() {
		for (Contender contender : contenders) {
			if (contender.getPosition() == 70 || contender.getPosition() > 70)
				return false;
		}
		return true;
	}
}
                          