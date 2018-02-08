package Les4HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les4HW1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please write 3 float numbers");
		float f1=Float.parseFloat(buf.readLine());
		float f2=Float.parseFloat(buf.readLine());
		float f3=Float.parseFloat(buf.readLine());
		
		if((f1>=-5)&(f1<=5)){
			System.out.println("First number belongs to the range");
		}
		else {
		
			System.out.println("First float number doesn`t belong to the range");
		}

		if((f2>=-5)&(f2<=5)){
			System.out.println("Second number belongs to the range");
		}
		else {
			System.out.println("First float number doesn`t belong to the range");
			
		}

		if((f3>=-5)&(f3<=5)){
			System.out.println("Third number belongs to the range");
		}
		else {
			System.out.println("First float number doesn`t belong to the range");
			
		}
		
		
		
//		if(((f1>=-5)|(f1<=5))&((f2>=-5)&(f2<=5))&((f3>=-5)&(f3<=5))) {
//			System.out.println("All numbers belongs to range [-5;5]");
//			
//		}
		
	}

}
