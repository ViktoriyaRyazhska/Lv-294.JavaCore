package first.exercise;

public class Main {

	public static void main(String[] args) {
		
		/*
			   Create an array of ten integers. Display 
				* the biggest of these numbers;
				* the sum of positive numbers in the array;
				* the amount of negative numbers in the array.
			    * What values there are more: negative or positive?

		*/
		
		int [] numbers = new int[10];
		numbers[0] = -5;
		numbers[1] = 45;
		numbers[2] = 3;
		numbers[3] = 5;
		numbers[4] = -7;
		numbers[5] = 16;
		numbers[6] = -78;
		numbers[7] = 56;
		numbers[8] = -8;
		numbers[9] = 28;
		
		Calculation calc = new Calculation(numbers);
		
		System.out.println("The biggest number: " + calc.biggestNumber());
		System.out.println("The sum of positive numbers: " + calc.sumOfPositiveNumbers());
		System.out.println("The amount of negative number: " + calc.amountOfNegativeNumbers());
		
		calc.comparisonOfSets();
		
		
	}

}
