package lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("please, write 5 names");
		String [] sarr = {b.readLine(), b.readLine(), b.readLine(), b.readLine(), b.readLine()};
//		String s1=b.readLine();
//		String s2=b.readLine();
//		String s3=b.readLine();
//		String s4=b.readLine();
//		String s5=b.readLine();
		
		String pattern = "[a-zA-Z_0-9]{3,15}";
		Matcher m;

		Pattern p = Pattern.compile(pattern);
		for(int i=0; i< sarr.length; i++) {
			if(!p.matches(pattern, sarr[i])) {
				System.out.println("You must enter only from 3 to 15 letters or numbers or _ when you write your name "+ sarr[i]);
			}
			
			
		}
		

	}

}
