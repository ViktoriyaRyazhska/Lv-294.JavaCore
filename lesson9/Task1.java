package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write first parametr of rectangle");
		try {
		int a = Integer.parseInt(br.readLine());
		System.out.println("Write second parametr of rectangle");
		int b = Integer.parseInt(br.readLine());
		System.out.println(squareRectangle(a, b));
		
		}
		catch (MyException e) {
			System.out.println("You enter wrong format of parametr of rectangle");
		}
		catch (IOException e) {
			
		}

	}
	public static int squareRectangle (int a, int b) throws MyException{
		if((a<0)|(b<0)){
			throw new MyException();
		}
		return a+b/2;
	}
}
