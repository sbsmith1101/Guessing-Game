
public class GuessingGame {
	int MysteryNumber = (int) ((Math.random() * 10) + 1);

	public String playGame(int guessedNumber) {

		if (guessedNumber > MysteryNumber && guessedNumber < 11) {
			return ("Too High try again");
		} else if (guessedNumber < MysteryNumber && guessedNumber > 0) {
			return ("Too Low try again");
		} else if (guessedNumber == MysteryNumber) {
			return ("Winner");
		} else if (guessedNumber >= 1 && guessedNumber <= 10) {
			return ("Losser");
		} else if (guessedNumber < 1) {
			return ("any number 1-10");
		} else if (guessedNumber > 10) {
			return ("any number 1-10");
		}
		return "Invalid";
	}
}
