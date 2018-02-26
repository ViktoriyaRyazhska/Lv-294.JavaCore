package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW2 {

	public static void main(String[] args)  {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		NumberInt ni = new NumberInt();
		try {
		ni.writeNumber(b);
		ni.opation();

		}
		catch (IOException | NumberFormatException e) {
			System.out.println("Please, write only integer digit");
		}
	}

}
