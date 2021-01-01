package exercise;

public class PrintSquareStar {

	public static void main(String[] args) {

		printSquareStar(5);
	}

	public static void printSquareStar(int number) {
		if (number >= 5) {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {
					if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == j) || (i + j == number + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
		} else {
			System.out.println("Invalid Value");
		}
	}

}
