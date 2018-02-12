package HW4;


import java.util.Scanner;

public class Ex_4_1 {

	public static void main(String[] args) {
		
		int[] month_days  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;

		 Scanner in = new Scanner(System.in);
	        System.out.print("Input number of month  ");
	        int number = in.nextInt();
	        System.out.print("Number of days in  "+number + " month is   "+month_days[number-1]);
	}


}
