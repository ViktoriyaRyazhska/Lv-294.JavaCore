package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Input {
	public static int[] inputNumbers(BufferedReader br) throws NumberFormatException, IOException {
		int[] dm = { 0, 0 };

		System.out.println("Please enter dimensions of the rectangle to calculate the area: ");

		for (int i = 0; i < dm.length; i++) {
			while (true) {
				String d = br.readLine();
				if (!checkInput(d)) {
					dm[i] = Integer.parseInt(d);
					break;
				} else {
					System.out.println("Please enter valid number.");
				}
			}
		}
		return dm;
	}

	public static boolean checkInput(String str) {
		String pattern = "[A-Za-z]{1,}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
