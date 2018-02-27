package les9HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int f = 0;
		int [] arr=new int[10];
		while (f < 10) {
			try {
				arr[f]=readNumber(1, 100, br);
			} catch (IOException | NumberFormatException e) {
				System.out.println("You should write only integer number");
			}
			f++;
		}
		print(arr);
		
	}

	public static int readNumber(int start, int end, BufferedReader br) throws IOException {
		System.out.println("Please write the number");
		int k = Integer.parseInt(br.readLine());
		if ((k >= start) & (k <= end)) {
			return k;
		} else {
			throw new IOException();
		}
	}
	public static void print(int [] arr) {
		System.out.println("Your number from range [1;100]:");
		for(Integer i : arr) {
			if(!(i==0)){
			System.out.println(i);
		}
	}
	}
}
