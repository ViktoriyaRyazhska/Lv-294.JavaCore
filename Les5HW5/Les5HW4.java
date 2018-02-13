package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW4 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		CreateArray ar = new CreateArray();
		ar.writeNumber(b);
		ar.product();
		ar.print();

	}

}
