package exercise.arrays;

public class RearrangeArray {

	public static void rearrange(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				System.out.print(arr[n - 1 - i / 2] + " ");
			}

			else {
				System.out.print(arr[(i - 1) / 2] + " ");
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		rearrange(arr, arr.length);

		// 6 1 5 2 4 3
	}
}
