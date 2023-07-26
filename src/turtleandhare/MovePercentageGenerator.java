package turtleandhare;

import turtleandhare.contenders.Contender;
import turtleandhare.contenders.Tortoise;

import java.math.BigInteger;
import java.security.SecureRandom;

public class MovePercentageGenerator {
	
	static SecureRandom randomNumberGenerator = new SecureRandom();

	public static int generateMove(Contender racer){
		if (racer instanceof Tortoise)
			return generateMoveForTortoise();
		return generateMoveForHare();
	}
	
	public static int generateMoveForTortoise(){
		return randomNumberGenerator.nextInt(10) + BigInteger.ONE.intValue();
	}
	public static int generateMoveForHare(){
		return randomNumberGenerator.nextInt(10) + BigInteger.ONE.intValue();
	}
}

