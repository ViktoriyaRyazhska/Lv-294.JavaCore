package Les1HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1HW2 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("What is your name?");
		String name = b.readLine();
		System.out.println("Where are you live, "+ name);
		String adress = b.readLine();
		System.out.println("You are "+ name+ " and you live in "+ adress);

	}

}
