package hw09;

import hw09.myExceptions.InvalidLengthException;
import hw09.myExceptions.InvalidNumberException;
import hw09.myExceptions.NonNumberException;
import hw09.myExceptions.ToLargeNumberException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application implements AutoCloseable {
	private static Scanner sc = new Scanner(System.in);

	public double div(double a, double b) {

		return a / b;
	}

	public int readNumber(int start, int end) throws NonNumberException,
			InvalidNumberException {
		int number = 0;
		try {
			System.out.println("Enter Number : ");
			number = sc.nextInt();
			if (number <= start || number >= end) {
				throw new InvalidNumberException(
						"Only Numbers in the range from " + start + " to "
								+ end + " !");
			}
		} catch (InputMismatchException exc) {
			throw new NonNumberException("Only Numbers!");
		}
		return number;
	}

	public void main(int start, int end, int length)
			throws InvalidLengthException {
		if ((end - start) < length) {
			throw new InvalidLengthException(
					"Length must be biger then (end - start) values!");
		}
		int[] numbers = new int[length];
		int number = start;
		int temp = start;
		for (int i = 0; i < numbers.length; i++) {
			boolean flag = true;
			while (flag) {
				try {
					number = readNumber(temp, end);
					if (number > (end - length + i)) {
						throw new ToLargeNumberException(
								"Number can not be large then "
										+ (end - length + i));
					}
					numbers[i] = number;
					temp = number;
					flag = false;
				} catch (NonNumberException | InvalidNumberException
						| ToLargeNumberException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		StringBuffer sb = new StringBuffer(start + " < ");
		for (int j : numbers) {
			sb.append(j + " < ");
		}
		sb.append(end);
		System.out.println(sb);
	}

	@Override
	public void close() {
		sc.close();

	}

}
