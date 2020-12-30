package exercise;

public class LastDigitChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSameLastDigit(41, 22, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));

		System.out.println(hasSameLastDigit(23, 34, 55));

	}

	public static boolean hasSameLastDigit(int a, int b, int c) {
		if (isValid(a) && isValid(b) && isValid(c)) {

			a = a % 10;
			b = b % 10;
			c = c % 10;
			if (a == b || b == c || a == c) {
				return true;
			}
		}
		return false;
	}

	public static boolean isValid(int num) {
		if (num >= 10 && num <= 1000) {
			return true;
		}
		return false;
	}

}
