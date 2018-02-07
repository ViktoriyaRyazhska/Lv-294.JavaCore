package second.exercise;
import java.io.BufferedReader;
import java.io.IOException;

public class OddNumbers {

	/* Enter three numbers. Find out how many of them are odd. */

	private int n1;
	private int n2;
	private int n3;

	private int[] number = new int[3];
	private StringBuilder list;

	public OddNumbers() {

	}

	public OddNumbers(BufferedReader br) throws NumberFormatException, IOException {

		System.out.println("Enter first number: ");
		this.n1 = Integer.parseInt(br.readLine());

		System.out.println("Enter second number: ");
		this.n2 = Integer.parseInt(br.readLine());

		System.out.println("Enter third number: ");
		this.n3 = Integer.parseInt(br.readLine());

		number[0] = n1;
		number[1] = n2;
		number[2] = n3;
	}

	public int calculationOfOddNumbers() {
		list = new StringBuilder();

		int counter = 0;

		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				continue;
			} else {
				list.append(" " + Integer.toString(number[i]) + " ");

				counter++;
			}

		}
		return counter;
	}

	public void output() {
		System.out.println("Quantity of odd numbers: " + calculationOfOddNumbers() + "\nList of odd numbers ["
				+ list.toString() + "]");
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

}
