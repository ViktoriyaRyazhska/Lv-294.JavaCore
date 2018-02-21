package hw08.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpaceCutter {
	private String sentence;

	public SpaceCutter() {

	}

	public SpaceCutter(String sentence) {

		this.sentence = sentence;
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

	public void cutt1() {
		String[] arr = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].isEmpty()) {
				if (i > 0) {
					sb.append(" ");
					sb.append(arr[i]);
				} else {
					sb.append(arr[i]);
				}
			}
		}
		sentence = sb.toString();
	}

	public void cutt2() {
		StringBuilder sb = new StringBuilder();
		Pattern p = Pattern.compile("[a-zA-Z]+ ?");
		Matcher m = p.matcher(sentence);
		while (m.find()) {
			sb.append(sentence.substring(m.start(), m.end()));
		}
		sentence = sb.toString();
	}

}
