package homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int readNumber(int start, int end) throws IOException, RangeException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		
		if(number > start && number < end) {
			return number;
		} else {
			throw new RangeException("Number doesn't belong to the range [" + start + ";" + end + "]");
		}
	}

	public static void main(String[] args) throws IOException, RangeException, NewException{
		
		int[] numbers = new int[10];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println("Enter value for start");
			int start = Integer.parseInt(br.readLine());
			System.out.println("Enter value for end"); 
			int end = Integer.parseInt(br.readLine());
			System.out.println("Enter numbers");
			numbers[0] = readNumber(start, end);
			
			for(int i = 1; i < numbers.length; i++) {
				numbers[i] = readNumber(start, end);
				if(numbers[i] < numbers[i-1]) {
					throw new NewException("Enter larger number then " + numbers[i-1]);
				}
			}
		} catch (RangeException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Enter only numbers");
		} 
		catch (NewException e) {
			System.out.println(e.getMessage());
		}
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}
}
