package exercise.arrays;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 2, 4, 22, 33, 11, 66 };
		reverse(arr);
	}

	public static void reverse(int[] arr) {
		int[] newArr = new int[arr.length];
		int count = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			newArr[count] = arr[i];
			count++;
		}
		System.out.println("Array = " + Arrays.toString(arr));
		System.out.println("Reversed array = " + Arrays.toString(newArr));

	}

}
