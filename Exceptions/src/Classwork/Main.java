package Classwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		/*try {
			int a = Integer.parseInt(reader.readLine());
			int b = Integer.parseInt(reader.readLine());
			Rectangle rec = new Rectangle(a,b);
			System.out.println(rec.square());
		}catch (NegativeSquareException e) {
			System.err.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}*/
		
		try {
			String col = reader.readLine();
			String type = reader.readLine();
			double size = Double.parseDouble(reader.readLine());
			Plant p = new Plant(col,type,size);
			System.out.println(p);
		}catch (ColorException e) {
			System.out.println(e.getMessage());
		}catch (TypeException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
