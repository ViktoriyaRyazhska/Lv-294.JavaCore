package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		f1(reader);
		f2(reader);
		f3(400);
	}

	public static void f1(BufferedReader reader) {
		int a;
		for (int i = 0; i < 3; i++) {
			try {
				a = Integer.parseInt(reader.readLine());
				if (a >= -5 && a <= 5) {
					System.out.println("Number a belongs to the range [-5;5]");
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void f2(BufferedReader reader) {
		int array[] = new int[3];
		for (int i = 0; i < 3; i++) {
			try {
				array[i] = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		int max = array[0];
		for(int i=0;i<array.length;i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum: " + max);
	}
	
	public static void f3(int err_code) {
		HTTPError[] errors = HTTPError.values();
		for(int i = 0; i < errors.length;i++) {
			if(err_code == errors[i].getCode()) {
				System.out.println(errors[i].toString());
				break;
			}
		}
	}

}
