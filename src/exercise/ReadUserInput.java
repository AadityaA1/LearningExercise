package exercise;

import java.util.Scanner;

public class ReadUserInput {
	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Program to calculate sum of 10 numbers");
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter number #" + (i + 1));
			arr[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the numbers : " + sum);
		scanner.close();
	}

}
