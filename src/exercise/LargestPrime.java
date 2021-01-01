package exercise;

import java.util.ArrayList;

public class LargestPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// getLargestPrime(21);
		System.out.println(getLargestPrime(21));
//		getLargestPrime(0);
//		getLargestPrime(45);
//		getLargestPrime(-1);

	}

	public static int getLargestPrimeNumber(int number) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for (int i = 0; i <= number / 2; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		int largestPrime = -1;
		for (int iterator = 0; iterator < primeNumbers.size(); iterator++) {
			if (number % primeNumbers.get(iterator) == 0) {
				largestPrime = primeNumbers.get(iterator);
			}
		}
		return largestPrime;
	}

	public static boolean isPrime(int number) {
		if (number == 1 || number == 0) {
			return false;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getLargestPrime(int num) {
		if (num <= 1)
			return -1;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				list.add(i);
				num = num / i;
			}
		}

		return list.get(list.size() - 1);
	}
}
