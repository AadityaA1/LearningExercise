package exercise.loops;

public class LeapYearCalculator {

	public static void main(String[] args) {
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));

		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));

	}

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year < 0 || year > 9999) {
			isLeap = false;
		} else if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeap = true;
				} else {
					isLeap = false;
				}
			} else {
				isLeap = true;
			}
		} else {
			isLeap = false;
		}
		return isLeap;
	}
}
