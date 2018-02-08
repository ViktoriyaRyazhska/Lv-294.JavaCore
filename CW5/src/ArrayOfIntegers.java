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
			
			System.out.println("The biggest number is" + max);			
			
			
		int posamo=0;
		int negamo=0;
		int possum=0;
		int negsum=0;
	

			if (array[i]>0) {
				posamo++;
				possum+=array[i];
			} else if  (array[i]<0) {
				negamo++;
				negsum+=array[i];
			}
				
			System.out.println("The sum of POSitive numbers:" + possum);
			System.out.println("The sum of NEGative numbers:" + negsum);
			
			System.out.println("Amount of POSitive numbers:" + posamo);
			System.out.println("Amount of NEGative numbers:" + negamo);
			
			
			if (posamo>negamo)
				System.out.println("There are more positive values than negative");
				else if (posamo==negamo)
					System.out.println("There are draw amount of positive and negative values");
					else
						System.out.println("There are more positive values");	
				
		
			
			
		}

		
		System.out.println(max);	
		
	}

}
