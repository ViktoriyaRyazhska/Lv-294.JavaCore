package cw04.task1;

import java.util.Scanner;

public class Numbers {
	private Scanner sc = new Scanner(System.in);
	private int count = 0;

	public void start(int times) {
		for (int i = 0; i < times; i++) {
			System.out.println("Enter number : ");
			int a = sc.nextInt();
			System.out.println("---------------------------------------");
			if (a % 2 != 0) {
				count++;
			}
		}
		System.out.println("---------------------------------------");
		System.out.println("It is " + count + " odd number(s)");
	}
}
