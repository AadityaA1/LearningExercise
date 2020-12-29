package exercise;

public class EqualSumChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasEqualSum(1, -1, 0));
	}

	public static boolean hasEqualSum(int a, int b, int c) {
		boolean sum = false;
		if (a + b == c) {
			sum = true;
		}
		return sum;
	}

}
