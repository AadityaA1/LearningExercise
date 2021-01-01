package exercise.operators;

public class SecondsMinutes {

	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 5));
		System.out.println(getDurationString(1000));
		System.out.println(getDurationString(-1000));

	}

	public static String getDurationString(int minutes, int seconds) {
		String value = null;
		if (minutes < 0 || (seconds < 0 && seconds > 59)) {
			value = INVALID_VALUE_MESSAGE;
		} else {
			int hour = minutes / 60;
			minutes = minutes % 60;
			String hourValue = addZero(hour);
			String minValue = addZero(minutes);
			String secValue = addZero(seconds);
			value = hourValue + "h " + minValue + "m " + secValue + "s";
		}
		return value;
	}

	public static String getDurationString(int seconds) {
		String value = null;
		if (seconds < 0) {
			value = INVALID_VALUE_MESSAGE;
		} else {
			int min = seconds / 60;
			seconds = seconds % 60;
			value = getDurationString(min, seconds);

		}
		return value;
	}

	public static String addZero(int value) {
		return (value < 10 ? "0" : "") + value;
	}
}
