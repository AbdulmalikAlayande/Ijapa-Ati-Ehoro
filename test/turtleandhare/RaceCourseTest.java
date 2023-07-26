package turtleandhare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static turtleandhare.TortoiseMoveType.*;

public class RaceCourseTest {
	Tortoise ijapa;
	Hare ehoro;
	@BeforeEach void startAllTestWith(){
		ijapa = new Tortoise();
		ehoro = new Hare();
		
	}

	@Test void testThatTurtleExists(){
		assertThat(ijapa).isNotNull();
	}
	
	@Test void testThatHareExists(){
		assertThat(ehoro).isNotNull();
	}
	
	@Test void testThatTortoiseCanMoveOnRaceTrack(){
		
	}
	
	@Test void testThatTortoiseCanDoFastPlod(){
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ijapa.move(FAST_PLOD);
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.valueOf(4).intValue());
	}
	
	@Test void testThatTortoiseCanDoSlowPlod(){
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ijapa.move(FAST_PLOD);
		ijapa.move(FAST_PLOD);
		ijapa.move(FAST_PLOD);
		ijapa.move(SLIP);
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.valueOf(4).intValue());
	}
	
	@Test void testThatIfTortoiseSlipsAndPositionIsLesserThanSixPositionPositionIsSetToOne(){
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ijapa.move(SLIP);
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
	}
	
	@Disabled
	@Test void testThatIfTortoisePositionIsAtTheEndOfTheRaceTrackAndTortoiseTriesToMoveExceptionIsThrownToAvoidRaceTrackArrayIndexOutOfBounds(){
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ijapa.setPosition(69);
		assertThatThrownBy(()->ijapa.move(FAST_PLOD)).isInstanceOf(RaceEndsException.class);
	}
	
	@Test void testThatHareCanDoSleepAndNoMoveAtAll(){
		assertThat(ehoro.getPosition()).isEqualTo(BigInteger.ONE.intValue());
		ehoro.move(HareMoveType.SLEEP);
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.ONE.intValue());
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
