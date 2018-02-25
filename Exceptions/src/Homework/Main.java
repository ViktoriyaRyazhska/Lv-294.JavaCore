package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		int[] array = new int[10];
		int  i = 0;
		boolean b = true;
		while(b) {
			try {
				for(;i < 10;) {
					array[i] = readNumber(1,100);
					i++;
				}
				b = false;
			}catch(NumberFormatException | NumberOutOfSectionException e) {
				System.out.println("Wrong input!Try one more time");;
			}
		}
	}
	
	public static double div(int a, int b) {
		int result = 0;
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("b is equal to zero");
		}
		return result;
	}
	
	public static int readNumber(int start, int end) throws NumberFormatException,NumberOutOfSectionException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = 0;
		try {
			number =Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		if(number < start || number > end) {
			throw new NumberOutOfSectionException();
		}
		return number;
	}
	
}
