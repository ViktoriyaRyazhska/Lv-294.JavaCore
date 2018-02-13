package fourth.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	public int[] inputIntegerNumber(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Please enter integer numbers (input will be stopped, when you type a negative number): ");
		int size = 10;
		int[] array = new int[size];

		int counter = 0;
		while (true) {
			if (counter < array.length) {
				int n = Integer.parseInt(br.readLine());
				if (n > 0) {
					array[counter] = n;
					counter++;
				} else {
					break;
				}
			} else {
				size += 10;
				int[] temp = new int[size];
				for (int i = 0; i < array.length; i++) {
					temp[i] = array[i];
				}
				array = temp;
			}
		}
		return array;
	}

}
