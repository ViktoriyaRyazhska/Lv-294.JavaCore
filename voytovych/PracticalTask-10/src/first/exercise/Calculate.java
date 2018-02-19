package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Calculate {
	public static int squareRectangle(BufferedReader br) throws NegativeValueException, NumberFormatException, IOException {
		int area;
		int[] dm = Input.inputNumbers(br);
		int a = dm[0];
		int b = dm[1];
		if ((a > 0) && (b > 0)) {
			area = a * b;
		} else {
			throw new NegativeValueException("Input value is below zero!");
		}
		return area;
	}
}
