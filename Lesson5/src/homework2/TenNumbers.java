package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TenNumbers {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int[] numbers = new int[10];
		System.out.println("Enter 10 integer numbers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(br.readLine());
		}
		
		int sumPr = 0;
		for (int i=0; i <= 4; i++)	
			 if(numbers[0] > 0 && numbers[1] > 0 && numbers[2] > 0&& numbers[3] > 0 && numbers[4] > 0) {
				sumPr+=numbers[i];
			} else {
				sumPr = 1;
				for(i = 5; i < numbers.length; i++) {
					sumPr *= numbers[i];
				}
					
			}
		
		System.out.println(sumPr);

	}
}
