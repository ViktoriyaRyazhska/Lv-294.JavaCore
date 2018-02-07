/*Solve the next tasks:
read 3 float numbers and check: are they all belong to the range [-5,5];
read 3 integer numbers and write max and min of them;
read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
Ñreate class Dog with fields name, breed, age. 
Declare enum for field breed. 
Create 3 instances of type Dog. 
Check if there is no two dogs with the same name. 
Display the name and the kind of the oldest dog. 
*Add Unit Tests to each task, publish code on GitHub
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A1aFloatRange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));

	    	System.out.println("Please, input three float numbers:");
	    	float a = Float.parseFloat(br.readLine());
	    	float b = Float.parseFloat(br.readLine());
	    	float c = Float.parseFloat(br.readLine());
	    	String result = ((a>(-5))&&(a<5)&&
	    					(b>(-5))&&(b<5)&&
	    					(c>(-5))&&(c<5))?
	    			"Numbers in range[-5;5]":"Numbers out of range [-5;5]";
	    	System.out.println(result);		
	}

}
