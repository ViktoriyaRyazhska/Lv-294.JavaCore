package homework1;

import java.util.Scanner;

public class Numbers {

	public static int amount;
	
	public static void main(String[] args) {
		
		System.out.println("Write three float numbers");
		
		Scanner a = new Scanner(System.in);
		float n1 = a.nextFloat();
		float n2 = a.nextFloat();
		float n3 = a.nextFloat();
		
		if (-5 <= n1 && n1 <= 5) {
			System.out.println("First number belongs to the range");
			amount++;
		}
		
		if (-5 <= n2 && n2 <= 5) {
			System.out.println("Second number belongs to the range");
			amount++;
		}
		
		if (-5 <= n3 && n3 <= 5) {
			System.out.println("Third number belongs to the range");
			amount++;
		}
		
		if (amount == 0 || amount == 1) {
			System.out.println(amount + " of these numbers belongs to the range [-5;5]");
		} else {
			System.out.println(amount + " of these numbers belong to the range [-5;5]");
		}
		
	}

}
