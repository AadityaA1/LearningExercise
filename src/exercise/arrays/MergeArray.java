package exercise.arrays;

import java.util.Arrays;

public class MergeArray {

	public static void merge(int arr1[], int arr2[], int n, int m) {
		// code here
		int temp;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (arr2[i] < arr1[j]) {
					temp = arr2[i];
					arr2[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		Arrays.sort(arr2);
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 0, 2, 6, 8, 9 };
		merge(arr1, arr2, arr1.length, arr2.length);
	}

}
