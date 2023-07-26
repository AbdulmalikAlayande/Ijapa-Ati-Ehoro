package turtleandhare;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RaceCourseTest {
	@BeforeEach void startAllTestWith(){
		
	}

	@Test void testThatTurtleExists(){
		Turtle ijapa = new Turtle();
		assertThat(ijapa).isNotNull();
	}
	
	@Test void testThatHareExists(){
		Hare ehoro = new Hare();
		assertThat(ehoro).isNotNull();
	}
	
	@Test void testThatTortoiseCanMoveOnRaceTrack(){
		
	}
	
	@Test void testThatTortoiseCanDoFastPlod(){
	
	}
	
	@Test void testThatTortoiseCanDoSlowPlod(){
	
	}
}
