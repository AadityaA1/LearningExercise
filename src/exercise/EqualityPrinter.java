package exercise;

public class EqualityPrinter {

	public static final String INVALID_VALUE_MESSAGE = "Invalid Value";

	public static void printEqual(int a, int b, int c) {
		String value = INVALID_VALUE_MESSAGE;
		if (a >= 0 && b >= 0 && c >= 0) {
			if ((a == b) && (b == c) && (c == a)) {
				value = "All numbers are equal";
			} else if ((a != b) && (b != c) && (c != a)) {
				value = "All numbers are different";
			} else {
				value = "Neither all are equal or different";
			}

		}
		System.out.println(value);
	}
}
