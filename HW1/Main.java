package hw01;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out
				.println("------------------------ Task №1 ------------------------");

		System.out.println("A flower bed perimeter and  area calculation : ");
		System.out.println("----------------------------------------------");
		System.out.println("Enter the radius(meters) of the flower bed : ");

		double radius = sc.nextDouble();
		double perimeter = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);

		System.out.println("----------------------------------------------");
		System.out.println("The flower bed with Radius: " + radius
				+ " meters have : \n Perimeter: " + perimeter
				+ " meters ; \n      Area: " + area + " meters square ;");
		System.out.println("----------------------------------------------");

		System.out
				.println("------------------------ Task №2 ------------------------");

		System.out.println("What is your name?");
		String name = sc.next();
		System.out.println("Where are you live, " + name + "?");
		String adres = sc.next();
		System.out.println("Your name is " + name + "\nYou are living in "
				+ adres);
		System.out.println("----------------------------------------------");

		System.out
				.println("------------------------ Task №3 ------------------------");

		System.out
				.println(" Enter the price (standard units) of the call to the Country №1 : ");
		double c1 = sc.nextDouble();
		System.out.println("Enter the talk durations(minutes) with Country №1 :");
		double t1 = sc.nextDouble();
		System.out.println("----------------------------------------------");
		System.out
				.println(" Enter the price (standard units) of the call to the Country №2 : ");
		double c2 = sc.nextDouble();
		System.out.println("Enter the talk durations(minutes) with Country №2 :");
		double t2 = sc.nextDouble();
		System.out.println("----------------------------------------------");
		System.out
				.println(" Enter the price (standard units) of the call to the Country №3 : ");
		double c3 = sc.nextDouble();
		System.out.println("Enter the talk durations(minutes) with Country №3 :");
		double t3 = sc.nextDouble();
		System.out.println("----------------------------------------------");

		double cost1 = c1 * t1;
		double cost2 = c2 * t2;
		double cost3 = c3 * t3;
		double totalCost = cost1 + cost2 + cost3;
		System.out.println("Cost of conversation with Country №1: " + cost1
				+ " standard units;");
		System.out.println("Cost of conversation with Country №2: " + cost2
				+ " standard units;");
		System.out.println("Cost of conversation with Country №3: " + cost3
				+ " standard units;");
		System.out.println("----------------------------------------------");
		System.out.println("Total cost of conversations: " + totalCost
				+ " standard units;");
	}
}
