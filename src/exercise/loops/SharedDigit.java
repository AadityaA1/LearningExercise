package exercise.loops;

public class SharedDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));

	}

	public static boolean hasSharedDigit(int a, int b) {
		if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
			int lastDigit = 0;
			while (a != 0) {
				lastDigit = a % 10;
				a = a / 10;
				if (String.valueOf(b).contains(String.valueOf(lastDigit)))
					return true;

			}
		}
		return false;
	}

}
