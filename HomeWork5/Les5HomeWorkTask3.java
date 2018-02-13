/* Enter 5 integer numbers. Find 
position of second positive number;
minimum and its position in the array. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HomeWorkTask3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Give me 5 numbers:");

        // Create a new array.
        int[] array = new int[5];

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("Second positive is " + array[j] + " at position " + j);
                break;
            }
        }
        
        int position = 0;
        int min = array[position];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            } 

        }
        System.out.println("Minimum is " + min + " at position " + position);
    }
}
