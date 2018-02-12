package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//f1(10);
		//f2(reader);
		//f3(reader);
		//f4(reader);
		
	}

	public static void f1(int month) {
		int[] month_days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		try {
			System.out.println("In month " + month + ":" + month_days[month + 1] + " days.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Such month doesn't exist!");
		}
	}

	public static void f2(BufferedReader reader) throws NumberFormatException, IOException {
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		boolean isPositive = true;
		int product = 1;
		int sum = 0;
		for (int i = 0; i < array.length / 2; i++) {
			product *=array[array.length-1 -i];
			if (array[i] < 0) {
				isPositive = false;
			}
			if(isPositive == false) {
				continue;
			}
			sum+=array[i];
		}
		if(isPositive) {
			System.out.println("Sum:" + sum);
		}else {
			System.out.println("Product:" + product);
		}
	}

	public static void f3(BufferedReader reader) throws NumberFormatException, IOException {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(reader.readLine());
		}
		int count = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
				index = i;
			}
			if (count == 2) {
				break;
			}
		}
		if (count == 1 || count == 0) {
			System.out.println("Couldn't find two or more positive numbers");

		} else {
			System.out.println("Position of second positive is " + index);
		}

		// ________________________________________________________________
		int min = array[0];
		index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > min) {
				min = array[i];
				index = i;
			}
		}
		System.out.println("Minimum: " + min + ".Index: " + index);
	}

	public static void f4(BufferedReader reader) throws NumberFormatException, IOException {
		int input = Integer.parseInt(reader.readLine());
		int product = 1;
		while (input >= 0) {
			if(input % 2 != 0 ) {
				product *= input;
			}
			input = Integer.parseInt(reader.readLine());
		}
		System.out.println("Product of even numbers: " + product);
	}
	
	public static void f5(int year, Car[] cars) {
		for (int i=0;i<cars.length;i++) {
			if(cars[i].getYear()==year) {
				System.out.println(cars[i].toString());
			}
		}
	}
	
}
