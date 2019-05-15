import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GuessingGameTest {
	GuessingGame underTest = new GuessingGame();

	@Test
	public void shouldSayWinnerForSeven() {
		String response = underTest.playGame(7);
		assertEquals("Winner", response);
	}

	@Test
	public void shouldSayLosserForOne() {
		String response = underTest.playGame(1);
		assertEquals("Too Low try again", response);
	}

	@Test
	public void shouldSayLosserForFour() {
		String response = underTest.playGame(4);
		assertEquals("Too Low try again", response);

	}
	@Test
	public void shouldSayInstructionForZero() {
		String response = underTest.playGame(0);
		assertEquals("any number 1-10", response);

	}
	@Test
	public void shouldSayInstructionForAboveTen() {
		String response = underTest.playGame(11);
		assertEquals("any number 1-10", response);

	}
}
