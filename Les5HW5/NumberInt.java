package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class NumberInt {
	int number[] = new int[10];
	int sum = 0;
	int product = 1;

	public void writeNumber(BufferedReader b) throws NumberFormatException, IOException {

		for (int i = 0; i < number.length; i++) {
			System.out.println("Write number " + (i + 1));
			number[i] = Integer.parseInt(b.readLine());
		}
	}

	public void opation() {
		System.out.println("operation is on");
		for (int i = 0; i < 5; i++) {
			if (number[i] > 0) {
				sum += number[i];
			} else {
				sum = 0;
				for (int j = 5; j < 10; j++) {
					System.out.println("prod");
					product *= number[j];

				}
			}

		}
		print();
	}

	public void print() {
		if (!(sum == 0)) {
			System.out.println("The sum of first five element is " + sum);
		} else {
			System.out.println("The product of last five element is " + product);
		}
	}

}
