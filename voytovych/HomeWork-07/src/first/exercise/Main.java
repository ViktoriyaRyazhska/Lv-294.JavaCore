package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Enter in the console sentence of five words. 
			* display the longest word in the sentence
			* determine the number of its letters
			* bring the second word in reverse order*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = Input.inputString(br);
		Show.showLongestWord(str);
		Show.showNumberOfLetters(str);
		Show.showReversedWord(str);

	}

}
