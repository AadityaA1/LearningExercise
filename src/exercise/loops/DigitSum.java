package exercise.loops;

//Sum digits > 10
public class DigitSum {

	public static void main(String[] args) {
		sumDigits(12345);
		sumDigits(1);

	}

	public static void sumDigits(int number) {
		int actualNum = number;
		int sum = -1;
		if (number >= 10) {
			sum = 0;
			while (number != 0) {
				sum += (number % 10);
				number = number / 10;
			}
		}
		System.out.println("Sum of digits of " + actualNum + " = " + sum);
	}
}
