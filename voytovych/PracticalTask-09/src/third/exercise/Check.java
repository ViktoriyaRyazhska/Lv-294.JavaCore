package third.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
	public static boolean checkInput(String str) {
		String pattern = "^[A-Za-z0-9_]{1,15}$";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m.matches();
	}
}
