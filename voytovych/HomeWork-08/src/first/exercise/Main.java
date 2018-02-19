package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		/*
		 * Create method div(), which calculates the dividing of two double numbers. In
		 * main method input 2 double numbers and call this method. Catch all
		 * exceptions.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			double a = Input.inputNumber(br);
			double b = Input.inputNumber(br);
			double result = Calculation.div(a, b);
			System.out.println(a + " div by " + b + " = " + result);
		} catch (IOException | NotNumberException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
