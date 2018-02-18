package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	public static String inputFirstString(BufferedReader br) throws IOException {
		System.out.println("Please enter first variable of type string: ");
		return br.readLine();
	}
	
	public static String inputSecondString(BufferedReader br) throws IOException {
		System.out.println("Please enter second variable of type string: ");
		return br.readLine();
	}
}
