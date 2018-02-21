package homework1;

import java.util.Scanner;

public class Numbers {

	public static int amount;
	
	public static void number(float n1) {
		if (-5 <= n1 && n1 <= 5) {
			System.out.println("Number " + n1 + " belongs to the range");
			amount++;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Write three float numbers");
		
		Scanner a = new Scanner(System.in);
		float n1 = a.nextFloat();
		float n2 = a.nextFloat();
		float n3 = a.nextFloat();
		
		number(n1);
		number(n2);
		number(n3);
		
		if (amount == 0 || amount == 1) {
			System.out.println(amount + " of these numbers belongs to the range [-5;5]");
		} else {
			System.out.println(amount + " of these numbers belong to the range [-5;5]");
		}
		
	}

}

}
