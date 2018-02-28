package les10HW10;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task4 {

	public static void main(String[] args) {
		String fileName = "file1.txt";
		List<String> list = new ArrayList<String>();

		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			String s;
			System.out.println("Read from file to list");
			while ((s = br.readLine()) != null) {
				list.add(s);

			}
		} catch (IOException e) {
			System.out.println("Can`t read from file");
			e.printStackTrace();
		}
//		print(list);

		String fileName2 = "file2.txt";

		String data = "\n";
		try (FileWriter fw = new FileWriter(fileName2); BufferedWriter bw = new BufferedWriter(fw);) {

			System.out.println("Writing to file");
			bw.write(String.valueOf("The number of lines is "+list.size()) + data);

			bw.write(list.get(countLines(list)) + data);
			bw.write("My name is Mariia Oleksiuk and my birthday date is 21 of September" + data);
		} catch (IOException e) {
			System.out.println("Can`t write to file");
		}

	}

//	public static void print(List<String> list) {
//		for (String l : list) {
//			System.out.println(l);
//
//		}
//	}

	public static int countLines(List<String> list) {
		String[] sarr = list.toArray(new String[list.size()]);
		String max = sarr[0];
		int maxi = 0;
		for (int i = 1; i < sarr.length; i++) {
			if (sarr[i].length() > max.length()) {
				max = sarr[i];
				maxi = i;
			}
		}
		return maxi;
	}
}
