package third.exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first standard units: ");
		double c1 = input.nextDouble(); // obtain user input
		System.out.println("");

		System.out.println("Enter second standard units: ");
		double c2 = input.nextDouble(); // obtain user input
		System.out.println("");

		System.out.println("Enter third standard units: ");
		double c3 = input.nextDouble(); // obtain user input
		System.out.println("");

		System.out.println("First call continued: ");
		double t1 = input.nextDouble(); // obtain user input
		System.out.println("");

		System.out.println("Second call continued: ");
		double t2 = input.nextDouble(); // obtain user input
		System.out.println("");

		System.out.println("Third call continued: ");
		double t3 = input.nextDouble(); // obtain user input
		System.out.println("");

		PhoneCalls calls = new PhoneCalls(c1, c2, c3, t1, t2, t3);
		calls.countSeparately();
		double[] s = calls.getSum();

		for (int i = 0; i < s.length; i++) {
			System.out.println("Phone calls ¹" + (i + 1) + ": " + s[i]);
		}

		System.out.printf("%nAll sum of talks: [ %.1f ]", calls.countTogether());

		input.close();
	}

}
