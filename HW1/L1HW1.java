package Les1HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please, write a radius");
		int radius = Integer.parseInt(br.readLine());
		double perimetr = 2*Math.PI*radius;
		double area = Math.PI*radius*radius;
		System.out.println("Perimeter= "+ perimetr);
		System.out.println("Area= "+area);
		

	}

}
