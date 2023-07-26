package turtleandhare;

import org.junit.jupiter.api.Test;
import turtleandhare.contenders.Hare;
import turtleandhare.contenders.Tortoise;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoveGeneratorTest {
	
	@Test void generateMoveForTortoiseTest(){
		Tortoise ijapa = new Tortoise();
		int generatedMove = MovePercentageGenerator.generateMove(ijapa);
		assertThat(generatedMove).isGreaterThan(BigInteger.ZERO.intValue());
		assertThat(generatedMove).isLessThanOrEqualTo(BigInteger.TEN.intValue());
	}
	
	@Test void generateMoveForHairTest(){
		Hare ehoro = new Hare();
		int generatedMove = MovePercentageGenerator.generateMove(ehoro);
		assertThat(generatedMove).isGreaterThan(BigInteger.ZERO.intValue());
		assertThat(generatedMove).isLessThanOrEqualTo(BigInteger.TEN.intValue());
	}
}
