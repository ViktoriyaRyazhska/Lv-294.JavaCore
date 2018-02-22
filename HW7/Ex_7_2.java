package HW7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_7_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(
		   		new InputStreamReader(System.in));
		System.out.println("Enter sentence");
		String sentence = br.readLine();
		//System.out.println(sentence);
		  String s2 = sentence.trim();
		    //System.out.println(s2);
	    
		    String resultString = s2.replaceAll("\\s+", " ");

		    System.out.println(resultString);
	}

}
