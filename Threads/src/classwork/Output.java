package classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Output {

	public void outputTXT(int times, String txt) throws InterruptedException {
		for (int i = 0; i < times; i++) {
			System.out.println(txt);
			Thread.sleep(1000);
		}
	}

	public void outputFile(BufferedReader reader) throws IOException {
		ArrayList<String> lines = new ArrayList<String>();
		String s = "";
		while ((s = reader.readLine()) != null) {
			lines.add(s);
		}
		//*******************************
		int[] sizes = Length(lines);
		for (int i = 0; i < sizes.length; i++) {
			System.out.print(sizes[i] + " ");
		}
		System.out.println();
		//*******************************
		System.out.println("Longest line " + getMaxValue(sizes));
		System.out.println("Shortest line " + getMinValue(sizes));
		System.out.println();
		//*******************************
		ArrayList<String> var = findStringsByKey(lines);
		for (Iterator iterator = var.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	private int[] Length(ArrayList<String> list) {
		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i).length();
		}
		return res;
	}

	private int getMaxValue(int[] numbers) {
		int maxValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxValue) {
				maxValue = numbers[i];
			}
		}
		return maxValue;
	}

	private int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
	
	private ArrayList<String> findStringsByKey(ArrayList<String> list){
		ArrayList<String> res = new ArrayList<String>();
		for(String line:list) {
			if(line.contains("var")) {
				res.add(line);
			}
		}
		return res;
	}

}
