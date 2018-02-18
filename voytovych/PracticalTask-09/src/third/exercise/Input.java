package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {
	public static String[] inputString(BufferedReader br) throws IOException {
		System.out.println("Please enter five username (min 3 max 15 characters, numbers, underscores): ");
		String s1 = br.readLine();
		String s2 = br.readLine();
		String s3 = br.readLine();
		String s4 = br.readLine();
		String s5 = br.readLine();
		String [] str = {s1, s2, s3, s4, s5};
	
		return str;
	}
}
