package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	public static String inputString(BufferedReader br) throws IOException {
		System.out.println("Please enter in the console sentence of five words (into one line): ");
		return br.readLine();
	}
}
