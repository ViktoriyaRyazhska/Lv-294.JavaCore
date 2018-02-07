package third.exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Phone calls from three different countries are ñ1, ñ2 and ñ3 standard units per minute. 
		 * Talks continued t1, t2 and t3 minutes. How much computer will count for each call separately 
		 * and all talk together? Input all source data from console, make calculations and output to the screen.
		 */

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

		PhoneCalls calls1 = new PhoneCalls(c1, t1);
		PhoneCalls calls2 = new PhoneCalls(c2, t2);
		PhoneCalls calls3 = new PhoneCalls(c3, t3);
		
		
		System.out.println("Phone calls ¹1 " + calls1.countTogether());
		System.out.println("Phone calls ¹2 " + calls2.countTogether());
		System.out.println("Phone calls ¹3 " + calls3.countTogether());


		System.out.printf("%nAll sum of talks: [ %.1f ]", PhoneCalls.getSum());

		input.close();
	}

}
