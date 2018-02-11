package task1;

public class Array {

	public static void main(String[] args) {

		int[] ten = { 5, -7, 10, -4, 45, 32, 9, -14, 8, 99 };

		int max = ten[0];
		int imax = 0;
		int i = 0;

		while (i < ten.length) {
			if (ten[i] > max) {
				max = ten[i];
				imax = i;
			}
			i++;
		}

		System.out.println("Max " + max);

		int sum = 0;

		for (int a = 0; a < ten.length; a++)
			if (ten[a] > 0) {
				sum += ten[a];
			}

		System.out.println("Sum = " + sum);

	

	int amount1 = 0;
	for(int d : ten)
	{
		if (d < 0) {
			amount1++;}
	}
		System.out.println(amount1);
		
		int amount2 = 0;
		for(int f : ten) {
			if (f > 0) {
				amount2++;}
			}
		
		if(amount2 > amount1) {
			System.out.println("Positive numbers are more");
		} else System.out.println("Negative numbers are more");
		
		}
}


