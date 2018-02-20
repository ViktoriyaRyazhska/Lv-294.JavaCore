package cw08.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {
private String pattern = "\\w{3,15}";
private Scanner sc = new Scanner(System.in);
public void userNameValidation() {
	
	System.out.println("Enter name : ");
	String name = sc.nextLine();
	Pattern p = Pattern.compile(pattern);
	Matcher m = p.matcher(name);
	if(!m.matches()) {
		System.out.println("name not valid!");
	}else {
		System.out.println("Ok!");
	}
	
}
public void close() {
	sc.close();
}
}
