package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_4_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Car[] car1 = new Car[4]; 
		car1[0]= new Car ("Truck", 2000, 500);
		car1[1]= new Car ("Minivan", 2005, 150);
		car1[2]= new Car ("Car", 2004, 110);
		car1[3]= new Car ("Wagon", 2001, 700);
		
		 System.out.println("Enter the model year ("+car1[0].getYearOfProduction()+","+car1[1].getYearOfProduction()+
				 ","+car1[2].getYearOfProduction()+","+car1[3].getYearOfProduction()+") ");
		    
		    String t1 = br.readLine();
		    int m1 = Integer.parseInt(t1);
	
		for(int i=0;i<4;i++)
		{ if (car1[i].getYearOfProduction()==m1) {
			
			 System.out.println("The model of " +m1+ " year is "+car1[i].getType()+", EngineCapacity = "+car1[i].getEngineCapacity());
		}
		}
		String tmpType;
		int tmpYear;
		int tmpEngineCapacity;
		
		for (int i = 0; i < car1.length - 1; i++) {
			for (int j = i + 1; j < car1.length; j++) {
				if (car1[i].getYearOfProduction() < car1[j].getYearOfProduction()) {
					tmpType = car1[i].getType();
					tmpYear = car1[i].getYearOfProduction();
					tmpEngineCapacity =car1[i].getEngineCapacity();
					car1[i].type = car1[j].getType();
					car1[i].yearOfProduction=car1[j].getYearOfProduction();
					car1[i].engineCapacity = car1[j].getEngineCapacity();
					car1[j].type = tmpType;
					car1[j].yearOfProduction=tmpYear;
					car1[j].engineCapacity = tmpEngineCapacity;
				}
			}
		}
		for (int i = 0; i < car1.length; i++) {
			 System.out.println("The type = " +car1[i].type+ ", year is = "+car1[i].yearOfProduction +", EngineCapacity = "+car1[i].getEngineCapacity());
		}
			
		}
		
	}


