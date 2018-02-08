package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* read 3 integer numbers and write max and min of them */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Input input = new Input(br);
		int[] numbers = input.getNumbers();
		FindNumbers find = new FindNumbers();

		System.out.println("The maximum number: " + find.findMax(numbers));
		System.out.println("The minimum number: " + find.findMin(numbers));
	}

}
