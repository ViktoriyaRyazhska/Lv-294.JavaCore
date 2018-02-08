package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	private int[] numbers;

	public Input(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter first number:");
		int n1 = Integer.parseInt(br.readLine());

		System.out.println("Enter first number:");
		int n2 = Integer.parseInt(br.readLine());

		System.out.println("Enter first number:");
		int n3 = Integer.parseInt(br.readLine());

		numbers = new int[3];
		numbers[0] = n1;
		numbers[1] = n2;
		numbers[2] = n3;

	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

}
