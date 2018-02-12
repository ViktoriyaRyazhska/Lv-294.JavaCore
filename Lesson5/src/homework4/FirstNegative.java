package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstNegative {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter integer");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int num = 0;
		int pr = 1;
		for(int i = 0; ; i++) {
			num = Integer.parseInt(br.readLine());
			if (num > 0) {
				pr = pr * num;
			} else { 
				break;
			 }
			}
		System.out.println("Product of all entered numbers is " + pr);
		}
}
