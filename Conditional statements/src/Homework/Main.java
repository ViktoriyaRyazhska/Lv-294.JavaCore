package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Task1");
		
		for (int i = 0; i < 3; i++) {
			try {
				int a = Integer.parseInt(reader.readLine());
				boolean check = false;
				if (a >= -5 && a <= 5) {
					check = f1(a);
				}
				if (check == true) {
					System.out.println(a + " belongs to the range [-5;5].");
				} else {
					System.out.println(a + " doesn't belong to the range [-5;5].");
				}
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Task2");

		int a = f2(reader);
		System.out.println("Maximum is: " + a);

		System.out.println("Task3");

		System.out.println(f3(401));
	}

	public static boolean f1(int a) {
		if (a >= -5 && a <= 5) {
			return true;
		}
		return false;
	}

	public static int f2(BufferedReader reader) {
		int array[] = new int[3];
		for (int i = 0; i < 3; i++) {
			try {
				array[i] = Integer.parseInt(reader.readLine());
			} catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static String f3(int err_code) {
		HTTPError[] errors = HTTPError.values();
		for (int i = 0; i < errors.length; i++) {
			if (err_code == errors[i].getCode()) {
				System.out.println(errors[i].toString());
				return errors[i].toString();
			}
		}
		return "Could'n find the error code";
	}

}
