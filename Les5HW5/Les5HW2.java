package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		NumberInt ni = new NumberInt();
		ni.writeNumber(b);
		ni.opation();

	}

}
