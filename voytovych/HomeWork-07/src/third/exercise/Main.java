package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Implement a pattern for US currency: the first symbol "$", 
		then any number of digits, dot and two digits after the dot. 
		Enter the text from the console that contains several 
		occurrences of US currency. Display all occurrences on the screen.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = Input.inputString(br);
		Show.showCurrency(str);
	}

}
