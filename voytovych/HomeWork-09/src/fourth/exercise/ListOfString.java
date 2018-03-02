package fourth.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListOfString {
	private BufferedReader br;
	private String fromFile = "file1.txt";

	public ListOfString(String fromFile) throws FileNotFoundException {
		this.br = new BufferedReader(new FileReader(fromFile));
	}

	public List<String> read() throws IOException {
		br = new BufferedReader(new FileReader(fromFile));
		List<String> list = new ArrayList<String>();
		String string = null;
		while ((string = br.readLine()) != null) {
			list.add(string);
		}
		br.close();
		return list;
	}

}
