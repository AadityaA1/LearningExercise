package exercise.loops;

public class NumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numberToWords(100);
		numberToWords(123);
		numberToWords(-123);
		System.out.println(reverse(-123));
		System.out.println(reverse(123));
		System.out.println(getDigitCount(0));
		System.out.println(getDigitCount(111));
		System.out.println(getDigitCount(-111));
		numberToWords(0);

	}

	public static void numberToWords(int number) {
		String numberInWord = "";

		if (number == 0) {
			numberInWord = "Zero";
		}
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
			int actualNum = number;
			int reverse = number = reverse(number);
			String numberToWord = "";
			while (number != 0) {
				int lastDigit = number % 10;
				switch (lastDigit) {
				case 0:
					numberToWord = "Zero";
					break;
				case 1:
					numberToWord = "One";
					break;
				case 2:
					numberToWord = "Two";
					break;
				case 3:
					numberToWord = "Three";
					break;
				case 4:
					numberToWord = "Four";
					break;
				case 5:
					numberToWord = "Five";
					break;
				case 6:
					numberToWord = "Six";
					break;
				case 7:
					numberToWord = "Seven";
					break;
				case 8:
					numberToWord = "Eight";
					break;
				case 9:
					numberToWord = "Nine";
					break;
				}

				numberInWord = numberInWord + " " + numberToWord;
				number = number / 10;
			}
			if (getDigitCount(reverse) != getDigitCount(actualNum)) {
				for (int i = 0; i < getDigitCount(actualNum) - getDigitCount(reverse); i++) {
					numberInWord = numberInWord.trim() + " Zero";
				}
			}
			System.out.println(numberInWord.trim());

		}

	}

	public static int reverse(int number) {
		int actualNum = number;
		if (number < 0) {
			number = Math.abs(number);
		}
		int reverse = 0;
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		return actualNum < 0 ? -reverse : reverse;

	}

	public static int getDigitCount(int num) {
		int count = -1;
		if (num >= 0) {
			count = 0;
			if (num == 0) {
				count = 1;
			}
			while (num != 0) {
				num = num / 10;
				count++;
			}
		}
		return count;
	}
}
