package cw08.task2;

import java.util.Scanner;

public class Applicatin {
	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter iformation : ");
		String information = sc.nextLine();
		sc.close();
		String[] arr = information.split(" ");
		System.out.println(arr[0] + " " + arr[1].charAt(0) + ". " + arr[2].charAt(0) + ".");
		System.out.println(arr[1]);
		System.out.println(arr[1] + " " + arr[2] + " " + arr[0]);
	}
}
