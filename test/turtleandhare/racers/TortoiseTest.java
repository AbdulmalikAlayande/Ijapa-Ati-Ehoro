package turtleandhare.racers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import turtleandhare.exceptions.RaceEndsException;
import turtleandhare.racers.Tortoise;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static turtleandhare.movetypes.TortoiseMoveType.FAST_PLOD;
import static turtleandhare.movetypes.TortoiseMoveType.SLIP;

public class TortoiseTest {
	Tortoise ijapa;
	@BeforeEach
	void startAllTestWith(){
		ijapa = new Tortoise();
	}
	
	@Test
	void testThatTurtleExists(){
		assertThat(ijapa).isNotNull();
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
}
