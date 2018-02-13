package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import second.exercise.Input;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Enter 5 integer numbers. Find 
			* position of second positive number;
			* minimum and its position in the array.*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input in = new Input(br);
		int [] array = in.inputNumbers();
		
		Calculation calc = new Calculation(array);

		if (calc.positiveNumber() == -1) {
			System.out.println("The array does not contain a positive number");
		}else {
			System.out.println("Position of second positive number "+ "[" + calc.positiveNumber()
			+ "]" + ": " + calc.positionOfNumber());	
		}
		
		System.out.println("Minimum " + "[" + calc.minimumNumber() + "]" + " and its position in the array: " + calc.posMinNumber());
	}

}
