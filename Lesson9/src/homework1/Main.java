package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static double div(double a, double b) throws ZeroNumberException{
		if(b > 0) {
		return a / b;
		} else {
			throw new ZeroNumberException("b cannot be 0");
		}
	}

	public static void main(String[] args) throws IOException, ZeroNumberException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter value for a");
			double a = Double.parseDouble(br.readLine());
			System.out.println("Enter value for b");
			double b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));
		}catch (ZeroNumberException e) {
			System.out.println(e.getMessage());
		}catch (NumberFormatException e) {
			System.out.println("Input only numbers!");
		}
	}
}
