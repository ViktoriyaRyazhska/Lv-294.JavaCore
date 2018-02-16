//Enter 10 integer numbers. Calculate the sum of first 5 elements
//if they are positive or product of last 5 element in the other case.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b2TenIntegersCondition {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Please, enter the 10 integer numbers.");
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int integers[] = new int[10];
		boolean positive = true;
		
		for (int i=0; i<=9 ; i++){
			System.out.println("Please, enter the " + (i+1) + " number:");
			integers[i] = Integer.parseInt(br.readLine());
			if (integers[i]<=0) {
				positive=false;
			System.out.println("WARNING!");
			System.out.println("The number, which you just entered, is negative or zero.");
			System.out.println("Result will be product of last 5 elements.");
			}
		}
		
		if (positive == true) {
			System.out.println("All numbers are positive. ");
			
			int sum = 0;
			int i = 0;
			do {
				sum+=integers[i];
				i++;
			} while (i<=4);
			System.out.println("Sum of first 5 elements are " + sum);	
		} else {
			int product = 1;
			int i = 5;
			do {
				product*=integers[i];
				i++;
			} while (i<=9);
			System.out.println("At least ONE OR MORE numbers is negative. "
					+ "Product of last 5 elements are " + product);	
		}
		}
	}

