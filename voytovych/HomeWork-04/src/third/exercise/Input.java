package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	
	private BufferedReader br;
	private int sizeOfArray;
	
	public Input(BufferedReader br) {
		this.br = br;
	}
	
	private boolean isValidNumber(String str) {
		return str.matches("[0-9]+");
	}
	
	public int[] inputNumbers() throws IOException {
		System.out.println("Please enter size of the array: ");
		String size = br.readLine();
		
		boolean inf1 = true;
		while (inf1) {
			if (isValidNumber(size)) {
				sizeOfArray = Integer.parseInt(size);
				break;
			} else {
				System.out.println("Please enter a valid number!");
				size = br.readLine();
			}
		}

		System.out.println("Please enter " + sizeOfArray + " integer numbers: ");
		int[] arrayOfNumbers = new int[sizeOfArray];

		for (int i = 0; i < arrayOfNumbers.length; i++) {
			String st = br.readLine();
			boolean inf2 = true;
			while (inf2) {
				if (isValidNumber(st)) {
					arrayOfNumbers[i] = Integer.parseInt(st);
					break;
				} else {
					System.out.println("Please enter a valid number!");
					st = br.readLine();
				}
			}

		}
		return arrayOfNumbers;
	}
}
