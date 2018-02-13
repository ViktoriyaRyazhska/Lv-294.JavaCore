package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	public static int inputId(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter ID of employee:");
		return Integer.parseInt(br.readLine());
	}
	
	public static String inputName(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter name of employee:");
		return br.readLine();
	}
}
