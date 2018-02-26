package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW1 {

	public static void main(String[] args)  {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Month month = new Month();
		try {
		month.print(b);
		month.pM(b);
	
		
		}
		catch (IOException | NumberFormatException e) {
			System.out.println("Please, write just digit from 1 to 12");
		}

	}

}
