package ua.voytovych;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTasks {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a: ");
		int a = Integer.parseInt(br.readLine());

		System.out.println("b: ");
		int b = Integer.parseInt(br.readLine());

		int r1 = a + b;
		int r2 = a - b;
		int r3 = a * b;
		double r4 = a / b;

		System.out.println("a + b = " + r1);
		System.out.println("a - b = " + r2);
		System.out.println("a * b = " + r3);
		System.out.println("a / b = " + r4);
		
		/*
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("How are you?");
		String answer = br.readLine();

		System.out.println("You are: " + answer + " )))");
		  
		  
		*/

	}

}
