package task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		List<String> prologue = new ArrayList<String>();
		
		List<String> two = new ArrayList<String>();
		
		String fileName = "C:\\Users\\1\\eclipse-workspace\\Lesson10\\src\\task3\\mytext.txt";
		
		int length = 0;
		String longest = null;
		String shortest = null;
		int shor = 0;
		int count = 0;
		
		try {
			FileReader fr = null;
			BufferedReader br = null;
			String line = null;

			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null) {
				++count;
				prologue.add(line + "\n");
				
				System.out.println("The line " + count + " has " + line.length() + " symbols");
				
				if(line.length() > length) {
					longest = line;
					length = line.length();
					
				} 
				
				if(line.contains("two")) {
					two.add(line);
				}
				
				if(shor > line.length() || shor == 0) {
					shor = line.length();
					shortest = line;
				} if (shor == line.length() && count > 1) {
					System.out.println("The shortest: " + shortest);
					if(line != shortest) {
					System.out.println("The shortest: " + line);
					}
				}
			}
			System.out.println("The longest line is [" + longest + "]");
			System.out.println("Lines with \"two\":" + two);
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}

