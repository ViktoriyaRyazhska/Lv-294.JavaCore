package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {

	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public void doTask() {
		int count = 0;
		int a;
		for (int i = 0; i < 3; i++) {
			try {
				a = Integer.parseInt(reader.readLine());
				if (isOdd(a)) {
					count++;
				}
			} catch (NumberFormatException e) {
				System.out.println("Wrong input!");
			} catch (IOException e) {
				System.out.println("IO Exception!");
			}
		}
		System.out.println("Amount of odd numbers: " + count);
	}

	public static boolean isOdd(int a) {
		return (double) a % 2 == 0 ? true : false;
	}
}
