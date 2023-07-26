package turtleandhare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HareTest {
	Hare ehoro;
	@BeforeEach
	void startAllTestWith(){
		ehoro = new Hare();
	}
	
	@Test
	void testThatHareExists(){
		assertThat(ehoro).isNotNull();
	}
	
	@Test void testThatHareCanDoSleepAndNoMoveAtAll(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(HareMoveType.SLEEP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
	}
	
	@Test void testThatHareCanBigHop(){
	
	}
	@Test void testThatHareCanDoBigSlip(){
	
	}
	
	@Test void testThatHareCanDoSmallHop(){
	
	}
	
	@Test void testThatHareCanDoSmallSlip(){
	
	}
}
