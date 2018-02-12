package HW4;

import java.util.Scanner;

public class Ex_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int nums  = 0;
		 int product;
		 Scanner in = new Scanner(System.in);
		
		 System.out.print("Enter integer number =  ");
		 nums=in.nextInt();
		 
		 if (nums<0) {product=0;}
		
		 else {
		  product = 1;
	       while ( nums >0) {
	      product = product*nums;
	      System.out.print("Enter integer number =  ");     
	      nums=in.nextInt();
	        
	       }
		 }  
	        System.out.println("Product of all entered numbers = "+ product);
	}

}
