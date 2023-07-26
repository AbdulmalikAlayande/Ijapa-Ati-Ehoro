package turtleandhare.racers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleandhare.racers.Hare;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static turtleandhare.movetypes.HareMoveType.*;

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
		ehoro.move(SLEEP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
	}
	
	@Test void testThatHareCanBigHop(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(BIG_HOP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.valueOf(10).intValue());
	}
	@Test void testThatHareCanDoBigSlip(){
	
	}
	
	@Test void testThatHareCanDoSmallHop(){
	
	}
	
	@Test void testThatHareCanDoSmallSlip(){
	
	}
}
