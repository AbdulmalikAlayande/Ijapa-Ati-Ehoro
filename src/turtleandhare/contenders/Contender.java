package turtleandhare.contenders;

import java.math.BigInteger;

public class Contender {
	
	int DEFAULT_POSITION = BigInteger.ONE.intValue();
	private int position = DEFAULT_POSITION;
	private String name;
	
	public int getPosition() {
		return position;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}
	
	public int move(int move){
		return position;
	}
}
