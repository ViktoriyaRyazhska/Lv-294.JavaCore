package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(reader.readLine());
			int b = Integer.parseInt(reader.readLine());
			Rectangle rec = new Rectangle(a,b);
			System.out.println(rec.square());
		}catch (NegativeSquareException e) {
			System.err.println("Negative height or width!");
		} catch (NumberFormatException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
