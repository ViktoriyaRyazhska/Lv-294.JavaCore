package les10HW10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {

		String file = "mytext.txt";

		try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {

			System.out.println("file was opened");

			String s = null;
			List<String> slist = new ArrayList<String>();

			while ((s = br.readLine()) != null) {
				slist.add(s);
			}
			// print(slist);
			everyLine(slist);
			countMaxLine(slist);

			countMinLine(slist);
			findLine(slist);
		} catch (IOException e) {

			System.out.println("Can`t open file");
		}

	}

	// public static void print(List<String> list) {
	// for (String l : list) {
	// System.out.println(l);
	// }
	//
	// }
	public static void everyLine(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("In line  " + (i + 1) + " are " + list.get(i).length() + " symbols");
		}
	}

	public static void countMaxLine(List<String> list) {
		String[] sarr = list.toArray(new String[list.size()]);
		String max = sarr[0];
		int maxi = 0;
		for (int i = 1; i < sarr.length; i++) {
			if (sarr[i].length() > max.length()) {
				max = sarr[i];
				maxi = i;
			}
		}
		System.out.println("Max line is " + (maxi + 1));
	}

	public static void countMinLine(List<String> list) {
		String[] sarr = list.toArray(new String[list.size()]);
		String min = sarr[0];
		int mini = 0;
		for (int i = 1; i < sarr.length; i++) {
			if (sarr[i].length() < min.length()) {
				min = sarr[i];
				mini = i;
			}
		}
		System.out.println("Max line is " + (mini + 1));
	}
//Написала колобок, бо такого слова як у завданні моя програма б не знайшла
	public static void findLine(List<String> list) {
		for (String l : list) {
			if (l.toLowerCase().contains("êîëîáîê")) {
				System.out.println("This line consict of word \"êîëîáîê\" " + l);
			}
		}
	}

}
