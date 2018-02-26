package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hm1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter sentence in the five words");
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		String[] word = sentence.split(" ");
		
		String longest = null;
		int len = 0;
		
		for(int i = 0; i < word.length; i++) {
			for(int j = i + 1; j < word.length; j++) {
				if(word[j].length() == word[i].length()) {
					longest = "All words have the same length";
					len = word[i].length(); 
			}if(word[j].length() > word[i].length()) {
					longest = word[j];
				} 
			} 
		} 
		if(longest != "All words have the same length") {
		System.out.println("The longest word in this sentence: " + longest);
		System.out.println("Number of its letters: " + longest.length());
		} else {
			System.out.println(longest);
			System.out.println("The length of each word is: " + len);
		}
		
		StringBuilder secondWord = new StringBuilder(word[1]);
		System.out.println(secondWord.reverse());
		
	}
}
