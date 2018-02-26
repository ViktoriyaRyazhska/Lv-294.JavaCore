package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter a");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter b");
			int b = Integer.parseInt(br.readLine());
			Rectangle r = new Rectangle(a,b);
			System.out.println(r.square(a, b));
		} catch (NegativeException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Enter only numbers");
		}
	}
}
