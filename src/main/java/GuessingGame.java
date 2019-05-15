
public class GuessingGame {

	public String playGame(int guessedNumber) {
		if (guessedNumber == 7 ) {
			return "Winner";
		}
		else if (guessedNumber <=0) {
			return "Please guess a number between 1 - 10";
		}
		else if (guessedNumber >= 11) {
			return "Please guess a number between 1 - 10";
		}
		else if (guessedNumber >=1 && guessedNumber <=10) {
			return "Losser";
		}
		if (guessedNumber > 7 && guessedNumber < 11)
			System.out.println("Too High");
		if (guessedNumber < 7 && guessedNumber > 0)
			System.out.println("Too Low");
		
	return"Invalid";
}
}
