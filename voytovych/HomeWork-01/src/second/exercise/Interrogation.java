package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Interrogation {

	public static void main(String[] args) throws IOException {


		/*
		 * Define String variables name and address. Output question 
		 * "What is your name?" Read the value name and output next 
		 * question: “Where do you live, (name)?". Read address and
		 *  write whole information.
		 *  */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your name?");
		
		String name = br.readLine();
		
		System.out.println("");
		
		System.out.println("Where do you live, " + name + "?");
		
		String address = br.readLine();
		

		System.out.printf("%nYour name is: %s%nYour address is: %s", name, address);

	}

}
