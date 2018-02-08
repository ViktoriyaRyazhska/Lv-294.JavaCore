package task1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Write first number");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		Numbers n1 = new Numbers(a);
		n1.count();

		System.out.println("Write second number");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		Numbers n2 = new Numbers(b);
		n2.count();

		System.out.println("Write third number");
		Scanner s3 = new Scanner(System.in);
		int c = s3.nextInt();
		Numbers n3 = new Numbers(c);
		n3.count();

		Numbers.HowMany();

	}

}
