package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	public static String inputString(BufferedReader br) throws IOException {
		System.out.println("Please enter a sentence that contains the words between more than one space: ");
		return br.readLine();
	}
}
