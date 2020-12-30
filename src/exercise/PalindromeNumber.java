package exercise;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(1234));
		System.out.println(isPalindrome(1));
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(-101));

	}

	public static boolean isPalindrome(int num) {
		int actualValue = Math.abs(num);
		num = Math.abs(num);

		int reverse = 0;
		while (num != 0) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num / 10;
		}

		if (actualValue == reverse) {
			return true;
		}
		return false;
	}

}
