package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
	
	class NonPositiveException extends RuntimeException {
		public NonPositiveException () { 
			System.out.println("Non positive number!");
		}
	}

	int squareRectangle (int a, int b) {
		if (a<0 || b<0)
			throw new NonPositiveException();
			return a*b;		
	}

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		try {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		task1 task1 = new task1();
		System.out.println(task1.squareRectangle (a,b));
		} catch ( NumberFormatException e) {
			System.out.println("Not a number!");
		}
		
	}

}
