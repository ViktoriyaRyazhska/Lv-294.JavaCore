/* Organize entering integers until 
   the first negative number. Count
   the product of all entered even numbers.
. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HomeWorkTask4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me numbers:");
        
        int number = 0;
        int product = 1;
        int counter = 0;
    	 
         do {
            number = Integer.parseInt(br.readLine());
            
            if (number < 0) {
                break;
            }
            if (number == 0) {
            	counter++;
            }
            else {
            	if (number % 2 == 0) {
                product *= number;
                counter++;
            } 
            
            else {
            	counter++;
            }
         
         
        }
         }
         while (true);
        if (counter>0) {
        System.out.println("Product of all even numbers is " + product);
        } 
        else {
    		System.out.println("There is no positive even numbers");
        }
    }        
}