package exercise.operators;

public class DecimalComparator {

	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}

	public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
		boolean compare = false;
		first = (double) ((long) (first * 1000)) / 1000;
		second = (double) ((long) (second * 1000)) / 1000;
		if (first == second) {
			compare = true;
		}
		return compare;

	}

}
