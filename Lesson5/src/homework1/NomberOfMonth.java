package homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NomberOfMonth {

	public static void main(String[] args) throws IOException {
		
		int days [] = {31, 28, 31, 30, 31, 30, 
				       31, 31, 30, 31, 30, 31};
		
		System.out.println("Enter number of month");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());;
		
		for(int i = 0; i < days.length;)
		if (number <= 12) {
		System.out.println(days[i]);
		break;
		} else {
			System.out.println("Enter number from 1 to 12");
			break;
		}
	}

}
