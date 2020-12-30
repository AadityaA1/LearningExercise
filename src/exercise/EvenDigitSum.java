package exercise;

public class EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789));
		System.out.println(getEvenDigitSum(-22));
		System.out.println(getEvenDigitSum(252));

	}

	public static int getEvenDigitSum(int num) {
		int sum = -1;
		if (num >= 0) {
			sum = 0;
			int lastDigit = 0;
			while (num != 0) {
				lastDigit = num % 10;
				if (lastDigit % 2 == 0) {
					sum += lastDigit;
				}
				num = num / 10;
			}
		}
		return sum;
	}
}
