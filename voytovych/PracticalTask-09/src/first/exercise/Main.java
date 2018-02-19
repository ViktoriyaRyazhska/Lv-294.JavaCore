package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Enter the two variables of type String. Determine whether the first 
		variable substring second. For example, if you typed «IT» and «IT Academy» 
		you must receive true.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = Input.inputFirstString(br);
		String s2 = Input.inputSecondString(br);
		Show.output(FindSubstring.findOut(s1, s2), s1, s2);
	}

}
