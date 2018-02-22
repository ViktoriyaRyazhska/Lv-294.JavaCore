package HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex_7_3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	     String pattern = "[$]+[0-9]+[.]+[0-9]+[0-9]";
	     
	   //  String text = "$132.34  Now is the time $ww $22.wwfr  $123.30 ";
	    
	     BufferedReader br = new BufferedReader(
			   		new InputStreamReader(System.in));
			System.out.println("Enter the text from the console that contains several occurrences of US currency ");
			String text = br.readLine();
	     
	     Pattern p = Pattern.compile(pattern);
	     Matcher m = p.matcher(text);
	     while (m.find()) {
	        System.out.print(text
				.substring(m.start(), m.end()) + "     ");
	  }

	}

}
