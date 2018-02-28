package homework4;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		
		List<String> list = new ArrayList<String>();
		
		String fileName1 = "C:\\Users\\1\\eclipse-workspace\\Lesson10\\src\\homework4\\file1.txt";
		String fileName2 = "C:\\Users\\1\\eclipse-workspace\\Lesson10\\src\\homework4\\file2.txt";
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		int number = 0;
		int length = 0;
		String longest = null;
		String name = null;
		String date = null;
		
		try {
			fr = new FileReader(fileName1);
			br = new BufferedReader(fr);
			String line = null;
			fw = new FileWriter(fileName2);
			bw = new BufferedWriter(fw);
			
			while((line = br.readLine()) != null) {
				++number;
				list.add(line);
				System.out.println(line);
				if(line.length() > length) {
					longest = line;
				}
				if(number == 1) {
					name = line;
				} if (number == 2) {
					date = line;
				}
			}
			bw.write(number + "\n");
			bw.write(longest + "\n");
			bw.write(name + "\n");
			bw.write(date);
			
			bw.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
