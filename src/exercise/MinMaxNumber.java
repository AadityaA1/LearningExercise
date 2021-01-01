package exercise;

import java.util.Scanner;

public class MinMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minNum = 0;
		int maxNum = 0;
		boolean first = true;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Enter number: ");
			boolean isAnInt = scanner.hasNextInt();
			if (isAnInt) {
				int number = scanner.nextInt();
				if (first == true) {
					minNum = number;
					maxNum = number;
					first = false;
				}

				if (minNum > number)
					minNum = number;
				if (maxNum < number)
					maxNum = number;
			} else {
				break;
			}

		}
		System.out.println("Minimum number - " + minNum);
		System.out.println("Maximum number - " + maxNum);
		scanner.close();
	}

}
