/*
 	Create an array of ten integers. Display 
the biggest of these numbers;
the sum of positive numbers in the array;
the amount of negative numbers in the array.
    What values there are more: negative or positive?
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayOfIntegers {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Please, input ten integers");
		
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));
	    
	
		int array[ ]  = new int[10];
		
		int max=0;
		
		for(int i = 0; i < 10; i++){
			array[i] = Integer.parseInt(br.readLine());
			
			if ((i==0)||(array[i]>max)) {
				max = array[i];
			}
			
		int posamo=0;
		int negamo=0;
		int possum=0;
		int negsum=0;
		
			if array[i]>0 {
				posamo++;
				possum+=array[i];
				
				
			}
			
			
		}

		
		System.out.println(max);	
		
	}

}
