package exercise;

public class DaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(1440);
	}

	public static final String INVALID_MESSAGE = "Invalid Value";

	public static void printYearsAndDays(long minutes) {
		if (minutes < 0)
			System.out.println(INVALID_MESSAGE);
		else {
			long hour = minutes / 60;
			long day = hour / 24;
			long year = day / 365;

			long minsLeft = minutes % (365 * 24 * 60);
			long daysLeft = minsLeft / (24 * 60);

			System.out.println(minutes + " min = " + year + " y and " + daysLeft + " d");
		}

	}
}
