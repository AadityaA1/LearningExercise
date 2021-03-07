package exercise.collections.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9 };
		System.out.println(binarySearch(arr, 1, 9, 8));
		System.out.println(binarySearch(arr, 1, 9, 6));
		System.out.println(binarySearch(arr, 1, 9, 2));
		System.out.println(binarySearch(arr, 1, 9, 5));

	}

	public static int binarySearch(int arr[], int first, int last, int key) {
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				return mid;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}

		return -1;

	}

}
