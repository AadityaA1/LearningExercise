package exercise.arrays;

import java.util.Scanner;

public class MinimumElement {

	public static int[] readElements(int count) {
		int[] arr = new int[count];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;
	}

	public static int readInteger() {
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		scanner.close();

		return count;
	}

	public static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

}
