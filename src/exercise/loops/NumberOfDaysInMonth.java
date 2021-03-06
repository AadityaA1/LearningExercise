package exercise.loops;

public class NumberOfDaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDaysInMonth(12, 10000));
	}

	public static boolean isLeapYear(int year) {
		boolean isLeap = false;
		if (year <= 0 || year > 9999) {
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

	public static int getDaysInMonth(int month, int year) {
		int numberOfDays = -1;
		boolean isLeap = isLeapYear(year);
		if ((month >= 1 || month <= 12) && (year > 0 && year <= 9999)) {
			switch (month) {
			case 1:
				numberOfDays = 31;
				break;
			case 2:
				if (isLeap)
					numberOfDays = 29;
				else
					numberOfDays = 28;
				break;
			case 3:
				numberOfDays = 31;
				break;
			case 4:
				numberOfDays = 30;
				break;
			case 5:
				numberOfDays = 31;
				break;
			case 6:
				numberOfDays = 30;
				break;
			case 7:
				numberOfDays = 31;
				break;
			case 8:
				numberOfDays = 31;
				break;
			case 9:
				numberOfDays = 30;
				break;
			case 10:
				numberOfDays = 31;
				break;
			case 11:
				numberOfDays = 30;
				break;
			case 12:
				numberOfDays = 31;
				break;
			}
		}
		return numberOfDays;
	}

}
