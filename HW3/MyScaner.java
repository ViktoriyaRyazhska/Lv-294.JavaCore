package hw03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyScaner {
	private Scanner sc = new Scanner(System.in);

	public int menuChoice(int min, int max) {
		boolean swch;
		int choice = 0;

		do {
			swch = false;
			try {
				choice = sc.nextInt();
				if (choice < min || choice > max) {
					System.out.println("Only numbers from " + min + " to "
							+ max + "!");
					swch = true;
				}
			} catch (InputMismatchException exc) {
				System.err.println("Input Mismatch Exception!");
				System.out.println("Only numbers from " + min + " to " + max
						+ "!");
				swch = true;
			}
		} while (swch);

		return choice;
	}

	public String inputName() {
		boolean swch;
		String name = "";

		do {
			swch = false;
			try {
				System.out.println("Enter Name : ");
				name = sc.next();
			} catch (InputMismatchException exc) {
				System.out
						.println("Input Mismatch Exception! Please try agen! ");
				swch = true;
			}
		} while (swch);

		return name;
	}

	public int inputYear(int min, int max) {
		boolean swch;
		int year = 0;

		do {
			swch = false;
			try {
				System.out.println("Enter year : ");
				year = sc.nextInt();
				if (year < min || year >= max) {
					System.out
							.println("Illegal Argument Exception! Please try agen! ");
					System.out.println("Incorect year input (" + min
							+ " < year <= " + max);
					swch = true;
				}
			} catch (InputMismatchException exc) {
				System.out
						.println("Input Mismatch Exception! Please try agen! ");
				swch = true;
				sc.next();
			}
		} while (swch);

		return year;
	}

	public void close() {
		sc.close();
	}
}
