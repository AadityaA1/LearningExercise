package learning;

import java.util.Calendar;
import java.util.Scanner;

public class C5ReadUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Enter your year of birth: ");

		int yearOfBirth = scanner.nextInt();
		scanner.close();

		System.out.println("Your name is " + name);
		System.out.println("Your age is " + (Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth));

	}

}
