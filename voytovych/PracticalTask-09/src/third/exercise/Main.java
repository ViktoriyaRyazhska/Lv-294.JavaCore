package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*The user name can be 3 to 15 characters of the Latin alphabet, 
		numbers, and underscores. Using regular expressions implement 
		checking the user name for validity. Input five names in the main method. 
		Output a message to the console of the validation of each of the entered names.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = Input.inputString(br);
		Show.showResult(str);
	}
}
