//Enter 5 integer numbers. Find 
//position of second positive number;
//minimum and its position in the array.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		
public class c3SecondPositive {
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));
		
		int integers[] = new int[5];
		
		int second_positive_position=-1;

		int min_position=-1;
		
		int min= Integer.MAX_VALUE;
		
		for (int i=0; i<=4 ; i++) {
			System.out.println("Please, enter the " + (i+1) + " number:");
			integers[i] = Integer.parseInt(br.readLine());
			
			boolean is_first_positive = false;
			
			if ((integers[i]>0) && (is_first_positive==false)) 
				is_first_positive=true;
			 else if (is_first_positive==true) {
				second_positive_position=i;
				System.out.println("The position of 2nd positive number is: " + (i+1));
			}
			

			if (i==0) 
				min=integers[i]; // min initialized in 22 line. everything okay 
			
			if 	(integers[i] < min) { // min not initialized. access modifiers? local variables in-cycle?
				min=integers[i];
				min_position=i;	
			}
		}
		
		if (second_positive_position<=0) 
		{
			System.out.println("There are less than 2 positive numbers.");
		}
		
		if (min_position==(-1))
			System.out.println("You entered numbers, equal by value.");
			else
				System.out.println("Minimal number is " + min + ". His position is "
				+ min_position + ".");	
		
	}
	}
