package third.exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find {
	public static Matcher findCurrency(String str) {
		String pattern = "[$][0-9]+[.][0-9]{1,2}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);
		return m;
	}
}
