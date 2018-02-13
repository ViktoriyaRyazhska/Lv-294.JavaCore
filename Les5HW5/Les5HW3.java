package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FiveInteger f = new FiveInteger();
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		f.writeNumber(b);
		f.position();
		f.minimun();

	}

}
