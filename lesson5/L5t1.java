package lesson5;

public class L5t1 {
	public static void main(String[] args) {

		int[] arr = { 5, 454, 8, -878, 77, 4845, -855, 55, 5, 21, 7888 };

		int max = arr[0];
		int sam=0;
		int neg=0;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if(arr[i]>=0) {
				sam+=arr[i];
			}
			else {
				neg++;
			}
		}
		System.out.println("The bigest og these number is "+max);
		System.out.println("The sum of positive numbers in the array is "+sam);
		System.out.println("The amount of negative numbers in the array is " + 
				neg++);
	}
}
