package third.exercise;

import java.util.regex.Matcher;

public class Show {
	public static void showCurrency(String str) {
		Matcher m = Find.findCurrency(str);
		
		System.out.println("\nUS currency: ");
		while(m.find()) {
			System.out.println(str.substring(m.start(), m.end()));
		}
	}
}
