package Les1HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please, write a radius");
		try {
			int radius = Integer.parseInt(br.readLine());
			System.out.println("Perimeter= " + perimetr(radius));
			System.out.println("Area= " + area(radius));
		} catch (IOException | NumberFormatException e) {
			System.out.println("You write wrong digit");
		}

	}

	public static double area(int radius) {
		if (radius > 0) {
			return Math.PI * radius * radius;
		} else
			throw new NumberFormatException();
	}

	public static double perimetr(int radius) {
		if (radius > 0) {
			return 2 * Math.PI * radius;
		} else
			throw new NumberFormatException();
	}
}
