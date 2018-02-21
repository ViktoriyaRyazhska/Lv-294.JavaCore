package hw08.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
	private String text;

	public Currency() {
	}

	public Currency(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void displayUS() {
		Pattern p = Pattern.compile("[$][\\d]+(\\.[\\d]{2})?");
		Matcher m = p.matcher(text);
		while (m.find()) {
			System.out.println(text.substring(m.start(), m.end()));
		}

	}
}
