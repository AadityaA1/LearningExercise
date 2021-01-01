package exercise.loops;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor(81, 153));
	}

	public static int getGreatestCommonDivisor(int first, int second) {
		if (first < 10 || second < 10) {
			return -1;
		}
		int min = first < second ? first : second;
		for (int i = min; i > 1; i--) {
			if (first % i == 0 && second % i == 0) {
				return i;
			}
		}
		return 1;

	}

}
