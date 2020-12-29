package exercise;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isPalindrome(1234));
//		System.out.println(isPalindrome(1));
//		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(-101));

	}

	public static boolean isPalindrome(int num) {
		int actualValue = Math.abs(num);
		num = Math.abs(num);
		String lastDigit = "";

		while (num != 0) {
			lastDigit += num % 10;
			num = num / 10;
		}

		if (actualValue == Integer.parseInt(lastDigit)) {
			return true;
		}
		return false;
	}

}
