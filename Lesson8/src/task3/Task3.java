package task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("Enter five usernames");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] username = new String[5];
		String name = "[A-Za-z_0-9]{3,15}";
		
		for(int i = 0; i < username.length; i++) {
			username[i] = br.readLine();
			Pattern p = Pattern.compile(name);
			Matcher m = p.matcher(username[i]);
		 
		if (m.matches()==true) {
			System.out.println(username[i] + " is valid username");
		} else {
			System.out.println("Username is not valid! The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores");
		}
		}
	}
}
