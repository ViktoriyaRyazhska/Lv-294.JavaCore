package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Enter a sentence that contains the words between more than one space. 
		Convert all spaces, consecutive, one. For example, if we introduce the 
		sentence "I    am      learning     Java   Core», 
		we have to get the "I'm learning Java Core»*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = Input.inputString(br);
		Show.showSentence(Transform.convertSpaces(str));
	}

}
