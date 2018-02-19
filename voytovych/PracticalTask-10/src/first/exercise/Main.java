package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Create a method for calculating the area of a rectangle int squareRectangle
		 * (int a, int b), which should throw an exception if the user enters negative
		 * value. Input values a and b from console. Check the squareRectangle method in
		 * the method main. Check to input nonnumeric value.
		 */

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("The area of rectangle: " + Calculate.squareRectangle(br));
		} catch (NegativeValueException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}

}
