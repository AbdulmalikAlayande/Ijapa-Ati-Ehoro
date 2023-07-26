package turtleandhare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleandhare.contenders.Hare;
import turtleandhare.contenders.Contender;
import turtleandhare.contenders.Tortoise;

import java.math.BigInteger;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class RaceCourseTest {

	RaceCourse raceCourse;
	@BeforeEach void startAllTestWith(){
		raceCourse = new RaceCourse();
	}

	@Test void testThatRaceCourseExists(){
		assertNotNull(raceCourse);
	}

	@Test void testThatRaceCourseHasPlayers(){
		Contender ijapa = new Tortoise();
		Contender ehoro = new Hare();
		raceCourse.setContenders(new Contender[]{ehoro, ijapa});
		assertNotNull(raceCourse.getContenders());
	}

	@Test void testThatRaceCourseHasSeventySquares(){
		assertThat(raceCourse.getSquares().length).isEqualTo(BigInteger.valueOf(70).intValue());
	}

	@Test void testThatRaceCourseCanSetTrackReady(){
		assertNull(raceCourse.getContenders());
		Contender ijapa = new Tortoise();
		Contender ehoro = new Hare();
		raceCourse.setContenders(new Contender[]{ehoro, ijapa});
		raceCourse.setTrackReady();
	}

	@Test void testThatRaceTrackCanEnd(){
	}
	
	@Test void testThatWhenEitherAnimalReachesTheLastSquareTheRaceEnds(){
	
	}
	
	@Test void race(){
		assertNull(raceCourse.getContenders());
		assertThat(raceCourse.getSquares().length).isEqualTo(BigInteger.valueOf(70).intValue());
		Contender ijapa = new Tortoise();
		Contender ehoro = new Hare();
		raceCourse.setContenders(new Contender[]{ehoro, ijapa});
		raceCourse.setTrackReady();
		raceCourse.race();
	}
}
