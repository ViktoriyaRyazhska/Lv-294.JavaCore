package fourth.exercise;

import java.io.IOException;
import java.util.List;

public class Lines {
	private List<String> listOfString;
	
	public Lines(ListOfString list) throws IOException {
		this.listOfString = list.read();
	}

	public int numberOfLines(){
		return listOfString.size();
	}
	
	public String longestLine(){
		String line = "";
		for (String string : listOfString) {
			if (string.length() > line.length()) {
				line = string;
			}
		}
		return line;
	}
}
