package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	public static String inputString(BufferedReader br) throws IOException {
		System.out.println("Please enter the text that contains several occurrences of US currency (the first symbol \"$\"): ");
		return br.readLine();
	}
}
