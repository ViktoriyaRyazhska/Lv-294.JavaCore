package homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Cars[] car = new Cars[4];
		car[0] = new Cars("Sedan", 2012, 1.8);
		car[1] = new Cars("Sedan", 2013, 2.1);
		car[2] = new Cars("Coupe", 2012, 2.0);
		car[3] = new Cars("Coupe", 2011, 1.9);
		
		System.out.println("Enter year of production");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int inputYear = Integer.parseInt(br.readLine());
		for(int i=0; i<car.length; i++) {
			if(inputYear == car[i].getYearOfProduction()) {
				System.out.println(car[i].toString());
			} 
		}
		System.out.println(" ");
		
		for(int i=0; i<car.length - 1; i++) {
			for (int j=i+1; j<car.length; j++) {
				if(car[i].getYearOfProduction() < car[j].getYearOfProduction()) {
					Cars tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				}
			}
		}
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i]);
		}
	
	}
}
