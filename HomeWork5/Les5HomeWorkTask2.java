/* 	Enter 10 integer numbers. 
	Calculate the sum of first 5 elements
	if they are positive or product of last 
	5 element in the other case.
	 */
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Les5HomeWorkTask2 {

	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Give me 10 numbers:");

	        // Create a new array.
	        int[] array = new int[10];

	        // Count negatives
	        int negativeCount = 0;
	        for (int i = 0; i < array.length; i++) {
	            array[i] = Integer.parseInt(br.readLine());
	            
	            if (i < 5 && array[i] < 0) {
	                negativeCount++;
	            }
	        }

	        if (negativeCount == 0) {
	            System.out.println("Sum: " + arraySumFirst5(array));            
	        } else {
	            System.out.println("Product: " + arrayProductLast5(array));
	        }
	    }
	    
	    private static int arraySumFirst5(int[] array) {
	        int sum = 0;
	        
	        for (int i = 0; i < 5; i++) {
	            sum += array[i];
	        }
	        
	        return sum;
	    }
	    
	    private static int arrayProductLast5(int[] array) {
	        int product = 1;
	        
	        for (int i = array.length - 5; i < array.length; i++) {
	            product *= array[i];
	        }
	        
	        return product;
	    }
	}
