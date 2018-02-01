package first.exercise;

import java.util.Scanner;

public class Main {
	
	/* 
	 * Flower bed is shaped like a circle. Calculate the perimeter 
	 * and area by entering the radius. Output obtained results.
	 */

	public static void main(String[] args) {
		
		FlowerBed fb = new FlowerBed();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius of Flower Bed: ");

		double radius = input.nextDouble(); // obtain user input
		
		System.out.printf("%nArea of Flower Bed: [ %.1f ] square meter%n", fb.area(radius));
		
		System.out.printf("%nPerimeter of Flower Bed: [ %.1f ] meter", fb.circleLength(radius));
		
		input.close();
		
	}

}
