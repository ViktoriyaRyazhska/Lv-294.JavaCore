package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.AclEntry.Builder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyClass {

	public static void main(String[] args) {
		BufferedReader reader  =  new BufferedReader(new InputStreamReader(System.in));
		f3(reader);
	}
	
	public static void f1(BufferedReader reader) {
		try {
			String[] sentence = reader.readLine().split(" ");
			int maxLength = sentence[0].length();
			String word = sentence[0];
			for(int i = 0; i < sentence.length;i++){
				if(sentence[i].length() > maxLength) {
					maxLength = sentence[i].length();
					word = sentence[i];
				}
			}
			System.out.println("The longest word is: " + word);
			
			System.out.println("The length of each word:");
			for(int i = 0; i < sentence.length;i++){
				System.out.print(sentence[i].length() + " ");
			}
			System.out.println();
			StringBuilder builder = new StringBuilder();
			for(int i = 0; i < sentence.length;i++){
				builder.append(sentence[1].charAt(sentence[1].length() -1 -i));
			}
			System.out.println(builder.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void f2(BufferedReader reader) {
		try {
			String text = reader.readLine().replaceAll("[\\s]{2,}", " ");
			System.out.println(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void f3(BufferedReader reader) {
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		String text = "";
		for(int i =0;i<5;i++) {
			try {
				text = reader.readLine();
				Matcher m = p.matcher(text);
				if(m.matches()) {
					System.out.println("Valid");
				}else {System.out.println("not valid");}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
