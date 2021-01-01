package exercise.readInput;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int count = 0;
		while (true) {

			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				sum += scanner.nextInt();
				count++;
				scanner.nextLine();
			} else {
				break;
			}
		}
		int avg = 0;
		if (count != 0)
			avg = sum / count;
		System.out.println("SUM = " + sum + " AVG = " + avg);
		scanner.close();
	}

}
