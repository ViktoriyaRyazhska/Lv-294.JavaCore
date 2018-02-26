package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		int[] array = new int[10];
		int  i = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean b = true;
		while(b) {
			try {
				for(;i < 10;) {
					array[i] = readNumber(1,100 , reader);
					i++;
				}
				reader.close();
				b = false;
			}catch(NumberFormatException | NumberOutOfSectionException e) {
				System.err.println("Wrong input!Try one more time");
				
			}catch(IOException e){
				System.err.println(e.getMessage());
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
	
	public static int readNumber(int start, int end, BufferedReader reader) throws NumberFormatException,NumberOutOfSectionException {
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
