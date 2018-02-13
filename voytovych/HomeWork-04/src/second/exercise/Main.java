package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		/*Enter 10 integer numbers. Calculate the sum of first 5 elements if 
		 * they are positive or product of last 5 element in the other case.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input in = new Input(br);
		int [] array = in.inputNumbers();
		int addands = in.inputNumberOfFirstPositiveAddends();
		Calculation calc = new Calculation(array, addands);
		calc.calculationNumbers();
		if(calc.isPositive()) {
			System.out.print("The sum of first " + addands + " elements: " + calc.getSum());
		}else {
			System.out.print("Product of last " + (array.length - addands) + " elements: " + calc.getProduct() );
		}
		
		
		
	}

}
