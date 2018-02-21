package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {

	public static void main(String[] args) throws IOException{

		System.out.println("Enter the sentence");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pattern = "[A-za-z]+";
		String sentence = br.readLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(sentence);
		
		while(m.find()) {
			System.out.print(sentence.substring(m.start(), m.end()) + " ");
		}
	}
}
