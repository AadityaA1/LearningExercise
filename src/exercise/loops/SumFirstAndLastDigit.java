package exercise.loops;

public class SumFirstAndLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(sumFirstAndLastDigit(121));
		System.out.println(sumFirstAndLastDigit(10208));
		// System.out.println(sumFirstAndLastDigit(-10));

	}

	public static int sumFirstAndLastDigit(int number) {
		int sum = -1;
		if (number >= 0) {
			sum = 0;
			int lastDigitValue = number % 10;
			// reverse number
			while (number > 9) {

				number = number / 10;
			}
			sum = number + lastDigitValue;
		}
		return sum;
	}

}
