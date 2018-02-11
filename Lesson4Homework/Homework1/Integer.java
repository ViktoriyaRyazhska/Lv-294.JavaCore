package homework1;

import java.util.Scanner;

public class Integer {

	public static void main(String[] args) {
		System.out.println("Write three integer number and I'll try to show max and min of them :)");
		
		Scanner a = new Scanner(System.in);
		int n1 = a.nextInt();
		int n2 = a.nextInt();
		int n3 = a.nextInt();
		
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("First number (" + n1 + ")  is max");
		} if (n2 >= n1 && n2 >= n3) {
			System.out.println("Second number (" + n2 + ") is max");
		} else {
			System.out.println("Third number (" + n3 + ") is max");
		}
		
		if (n1 <= n2 && n1 <= n3) {
			System.out.println("First number (" + n1 + ") is min");
		} if (n2 <= n1 && n2 <= n3) {
			System.out.println("Second number (" + n2 + ") is min");
		} else {
			System.out.println("Third number (" + n3 + ") is min");
		}

	}	
}
