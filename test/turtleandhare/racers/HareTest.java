package turtleandhare.racers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
	
	@Test void testThatIfEhoroDoesBigSlipAndPositionIsLesserThanOrEqualToTheNumberOfMovesForFastPlodPositionRemainsDefault(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(BIG_SLIP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
	}
	@Test void testThatHareCanDoBigSlip(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(BIG_HOP);
		ehoro.move(BIG_HOP);
		ehoro.move(BIG_SLIP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.valueOf(7).intValue());
	}
	
	@Test void testThatHareCanDoSmallHop(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(SMALL_HOP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.TWO.intValue());
	}
	
	@Test void testThatIfEhoroDoesSmallSlipAndPositionIsLesserThanTheValueForSmallSlipPositionIsSetToDefault(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(SMALL_HOP);
		ehoro.move(SMALL_SLIP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
	}
	
	@Test void testThatHareCanDoSmallSlip(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(BIG_HOP);
		ehoro.move(SMALL_SLIP);
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.valueOf(8).intValue());
	}
}
