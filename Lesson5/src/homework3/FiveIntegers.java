package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveIntegers {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] numbers = new int[5];
		System.out.println("Write five integer numbers");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		int num = 0;
		for(int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				num++;
			}
			if (num == 2) {
				System.out.println("Second positive number is in " + (i + 1) + " place.");
				break;
			}
		}
		if (num == 1) {
			System.out.println("You wrote only 1 positive number");
		}
		if (num == 0) {
			System.out.println("All numbers are negative");
		}
		
		int i = 0;
		int min = 0;
		int imin = 0;
		while (i < numbers.length) {
			if (numbers[i] < min) {	
				min = numbers[i];
				imin = i;
			}
			i++; }
		System.out.println("Min = " + min + ". It is in " + (imin + 1) + " place.");
	}
}
