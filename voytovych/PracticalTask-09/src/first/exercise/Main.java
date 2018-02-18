package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = Input.inputFirstString(br);
		String s2 = Input.inputSecondString(br);
		Show.output(FindSubstring.findOut(s1, s2), s1, s2);
	}

}
