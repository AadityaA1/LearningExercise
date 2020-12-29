package learning;

public class C4Methods {

	public static void main(String[] args) {
		displayHighScorePosition("Sachin", calculateHighScorePosition(1500));
		displayHighScorePosition("Dravid", calculateHighScorePosition(900));
		displayHighScorePosition("Sourav", calculateHighScorePosition(400));
		displayHighScorePosition("Dinesh", calculateHighScorePosition(50));
		displayHighScorePosition("Sachin", calculateHighScorePosition(1000));
		displayHighScorePosition("Sourav", calculateHighScorePosition(500));
		displayHighScorePosition("Dinesh", calculateHighScorePosition(100));

	}

	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " on the high score table");
	}

	public static int calculateHighScorePosition(int score) {
		if (score >= 1000) {
			return 1;
		} else if (score >= 500 && score < 1000) {
			return 2;
		} else if (score >= 100 && score < 500) {
			return 3;
		} else {
			return 4;
		}
	}
}
