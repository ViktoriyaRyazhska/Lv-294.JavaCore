package homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework3 {

	public static void main(String[] args) throws IOException{

		System.out.println("Enter the text that contains several occurrences of US currency");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pattern = "[$0-9.0-9{2}][^A-Za-z]";
		String text = br.readLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		
		while(m.find()) {
			System.out.print(text.substring(m.start(), m.end()));
		}
	}
}
