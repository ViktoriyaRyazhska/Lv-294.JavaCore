package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {

	public static int readNumber(int start, int end) throws IOException, NonNumberException, OutOfRangeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter number: ");
		String str = br.readLine();
		int n;
		if (!checkInput(str)) {
			n = Integer.parseInt(str);
			if (n > start && n < end) {
				return n;
			} else {
				throw new OutOfRangeException("The number is outside of range.");
			}
		} else {
			throw new NonNumberException("You have entered an incorrect number.");
		}
	}

	public static boolean checkInput(String str) {
		String pattern = "[A-Za-z]{1,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
