package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework1 {

	public static void main(String[] args) throws IOException{
		System.out.println("Enter sentence in the five words");
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		String[] word = sentence.split(" ");
		
		String longest = null;
		
		for(int i = 0; i < word.length; i++) {
			for(int j = i + 1; j < word.length; j++) {
				if(word[j].length() > word[i].length()) {
					longest = word[j];
				} 
			} 
		} 
		
		System.out.println("The longest word in this sentence: " + longest);
		System.out.println("Number of its letters: " + longest.length());
		
		StringBuilder secondWord = new StringBuilder(word[1]);
		System.out.println(secondWord.reverse());
		
	}
}
