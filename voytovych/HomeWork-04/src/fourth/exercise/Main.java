package fourth.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Organize entering integers until the first negative number. Count the product
		 * of all entered even numbers.
		 */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input in = new Input();
		int[] array = in.inputIntegerNumber(br);
		Product p = new Product();

		System.out.println("You entered the following positive numbers: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				System.out.println(array[i]);
			}

		}

		System.out.println("The product of all entered even numbers: " + p.countEvenNumbers(array));

	}
}
