import java.util.Scanner;

public class GuessingGameApp {

	public static void main(String[] args) {
		int tries = 3;
		Scanner input = new Scanner(System.in);
		System.out.println("Please guess a number between 1 - 10");
		System.out.println("Press -1 to Exit");
		System.out.println(tries + " total tries");
		int value = input.nextInt();
		tries = (tries - 1);
		GuessingGame game = new GuessingGame();
		while (value != -1 & tries > 0) {
			System.out.println(game.playGame(value));
			value = input.nextInt();
			tries = (tries - 1);
			System.out.println(tries + " more tries");
			if (tries <= 0) {
				System.out.println(game.playGame(value));
			}

			System.out.println("The Game is Over");

		}

	}

}
