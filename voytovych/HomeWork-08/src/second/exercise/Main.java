package second.exercise;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		/*
		 * Write a method readNumber(int start, int end), that read from console integer
		 * number and return it, if it is in the range [start...end]. If an invalid
		 * number or non-number text is read, the method should throw an exception.
		 * Using this method write a method main(), that has to enter 10 numbers: a1,
		 * a2, ..., a10, such that 1 < a1 < ... < a10 < 100
		 */

		int start = 1;
		int end = 10;
		for (int i = 1; i <= 10; i++) {
			if (i == 1) {
				start = 1;
			}else {
				start += 10;
				end += 10;
			}
			try {
				int number = Input.readNumber(start, end);
				System.out.println("Entered number " + number + " is in range " + "[" + start + " - " + end + "]");
			} catch (IOException | NonNumberException | OutOfRangeException e) {
				e.printStackTrace();
				break;
			}

		}

	}

}
