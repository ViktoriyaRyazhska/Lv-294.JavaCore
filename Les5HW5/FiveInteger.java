package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class FiveInteger {
	int[] numbers = new int [5];
	int p = 0;
	
	public void writeNumber(BufferedReader b) throws NumberFormatException, IOException {

		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Write number " + (i + 1));
			numbers[i] = Integer.parseInt(b.readLine());
		}
	}

	public void position() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				p += 1;
				if (p == 2) {
					System.out.println("The second positive number is on position " + (i+1));
					break;

				}
			}
		}

	}

	public void minimun() {
		int min=numbers[0];
		int j=0;
		for(int i =1; i< numbers.length; i++) {
			if(numbers[i]<min) {
				min=numbers[i];
				j=i;
			}
		}
		System.out.println("The minimum number is "+ min+ " and it`s on position "+ (j+1));
		

	}
}
