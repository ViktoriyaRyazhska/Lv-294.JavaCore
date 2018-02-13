package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	private boolean isNumeric(String str) {
		return str.matches("[0-9]+");
	}

	public int inputNumberOfMonth() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a number of month: ");
		String input = br.readLine();

		boolean valid = true;
		while (valid) {
			if (isNumeric(input)) {
				return Integer.parseInt(input);
			} else {
				System.out.println("Please enter a valid number!");
				input = br.readLine();
			}
		}
		return 1;
	}

}
