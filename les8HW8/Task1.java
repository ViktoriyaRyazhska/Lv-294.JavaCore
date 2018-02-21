package les8HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s =b.readLine();
		String [] sarr = s.split(" ");
		longestWord(sarr);
		numberOfLetters(sarr);
		secondToReverse(sarr);

	}
	public static void longestWord(String [] sarr) {
		String max=sarr[0];
		for(int i=1; i<sarr.length; i++) {
			if(sarr[i].length()>max.length()) {
				max=sarr[i];
			}
		}
		System.out.println("The longest world is " + max);
	}
	public static void numberOfLetters(String [] sarr) {
		int sum=0;
		for(int i=1; i<sarr.length; i++) {
			sum+=sarr[i].length();
			}
		System.out.println("Number of letters= "+sum);
	}
	
	public static void secondToReverse(String [] sarr) {
		StringBuilder st =new StringBuilder(sarr[1]);
		st.reverse();
		System.out.println("Revers of second word is "+st);
	}
	
	

	
}
