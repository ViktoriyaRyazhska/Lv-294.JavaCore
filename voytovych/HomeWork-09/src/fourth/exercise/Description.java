package fourth.exercise;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Description {
	private List<String> listOfString;

	public Description(ListOfString list) throws IOException {
		this.listOfString = list.read();
	}

	public String findWord(String word) throws IOException {
		String st = "";
		Pattern p = Pattern.compile(word);
		Matcher m;
		for (String string : listOfString) {
			m = p.matcher(string);
			if (m.find()) {
				st = string;
			}
		}
		return splitLine(st, word);
	}

	private String splitLine(String line, String word) {
		String[] arr = null;
		if (line != null) {
			arr = line.split(word);
		}
		return arr[arr.length - 1];
	}
}
