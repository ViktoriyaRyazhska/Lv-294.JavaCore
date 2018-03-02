package third.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TextList {

	public static List<String> takeText(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		List<String> st = new ArrayList<>();
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;

			while ((s = br.readLine()) != null) {
				st.add(s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return st;
	}
}
