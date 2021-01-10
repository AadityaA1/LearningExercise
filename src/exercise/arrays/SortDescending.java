package exercise.arrays;

import java.util.Scanner;

public class SortDescending {

	public static int[] getIntegers(int size) {
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {

			arr[i] = scanner.nextInt();
		}
		scanner.close();
		return arr;

	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + " contents " + arr[i]);
		}
	}

	public static int[] sortIntegers(int arr[]) {
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = i; j >= 0; j--) {
				if (arr[j] < arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}
