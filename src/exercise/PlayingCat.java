package exercise;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));

		System.out.println(isCatPlaying(false, 35));

	}

	public static boolean isCatPlaying(boolean summer, int temp) {
		boolean value = false;
		if (!summer && (temp >= 25 && temp <= 35)) {
			value = true;
		} else if (summer && (temp >= 25 && temp <= 45)) {
			value = true;
		}
		return value;
	}

}
