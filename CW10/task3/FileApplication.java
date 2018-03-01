package cw10.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileApplication {
	private String fileName;

	public FileApplication(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public List<String> read() throws FileNotFoundException {
		List<String> list = new ArrayList<String>();
		String string = null;
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			while ((string = br.readLine()) != null) {
				list.add(string);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int countAllSymbols() {
		int count = 0;
		try {
			for (String string : read()) {
				count += string.length();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("File have" + count + " symbols.");
		return count;
	}

	public String[] maxMin() {
		String[] arr = new String[2];

		try {
			List<String> list = read();
			arr[1] = list.get(0);
			arr[0] = list.get(1);
			for (String string : list) {
				if (string.length() > arr[1].length()) {
					arr[1] = string;
				}
				if (!string.equals("") && string.length() < arr[0].length()) {
					arr[0] = string;
				}
			}
			System.out.println(arr[0]);
			System.out.println(arr[1]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return arr;
	}

	public List<String> consist(String pattern) {
		List<String> list = new ArrayList<String>();
		Pattern p = Pattern.compile(pattern);
		Matcher m;
		try {
			for (String string : read()) {
				m = p.matcher(string);
				if (m.find()) {
					list.add(string);
				}
			}
			
			for (String string : list) {
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}
