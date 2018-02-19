package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
	public static double inputNumber(BufferedReader br) throws IOException, NotNumberException {
		double number;
		System.out.println("Please enter number: ");
		String n = br.readLine();
		if (!checkInput(n)) {
			number = Double.parseDouble(n);
		} else {
			throw new NotNumberException("You have entered an incorrect number");
		}
		return number;
	}

	public static boolean checkInput(String str) {
		String pattern = "[A-Za-z]{1,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
