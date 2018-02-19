package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Enter surname, name and patronymic on the console as a variable 
		  of type String. Output on the console: 
			* surnames and initials
			* name
			* name, middle name and last name
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = Input.inputString(br);
		Show.output(FindSubstring.find(str));
	}

}
