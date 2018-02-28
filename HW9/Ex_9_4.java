package HW9;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;
public class Ex_9_4 {

	public static void main(String[] args) throws IOException 
    {   
		String fileName = "file.txt";
		String fileName2 = "file1.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		 int k = 50, i = 0, count = 0;
	        String[] s = new String[k];
		
		fr = new FileReader(fileName);
		br = new BufferedReader(fr);
		
		
		System.out.println("Read data from file: " 
								+ fileName);
		s[0] = br.readLine();
		
		count=s[0].length();
		i=1;
		while ((s[i] = br.readLine()) != null) {
			if(s[i-1].length()<s[i].length()) {
				count=i;
				
			}
				i++;
						
		}
		
		System.out.println("Number of lines in file1.txt. = " + i);
		System.out.println("The number of longest line in file1.txt " + count);
		System.out.println(" The longest line in file1.txt.. = " + s[count]);		
		br.close();   
		
				
		fw = new FileWriter(fileName2);
		bw = new BufferedWriter(fw);
		System.out.println("Write data to file: " + fileName2);
		 
		bw.write("Number of lines in file1.txt. = " + i+"\n ");
		bw.write(" The longest line in file1.txt.. = " + s[count]+"\n ");
		bw.write("Yuriy Paliy 26.01.1973\n");
		
		bw.close();

    }

	

}
