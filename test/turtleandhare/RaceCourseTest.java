package turtleandhare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
		ijapa.move(TortoiseMoveType.FAST_PLOD);
		assertThat(ijapa.getPosition()).isEqualTo(BigInteger.valueOf(4).intValue());
	}
	
	@Test void testThatTortoiseCanDoSlowPlod(){
	
	}
}
