package turtleandhare;

import turtleandhare.rewards.Carrot;
import turtleandhare.rewards.Lettuce;

public class Pail {
	
	private Carrot[] carrots;
	private Lettuce[] lettuces;
	
	public Carrot[] getCarrots() {
		return carrots;
	}
	
	public void setCarrots(Carrot[] carrots) {
		this.carrots = carrots;
	}
	
	public Lettuce[] getLettuces() {
		return lettuces;
	}
	
	public void setLettuces(Lettuce[] lettuces) {
		this.lettuces = lettuces;
	}
}
