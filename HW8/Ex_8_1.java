package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_8_1 {
	private static boolean isDigit(String s) throws MyException {
	  		try {
	       
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
		throw new MyException("Inputed value is not double!");
	       
	    }
		
	}	
	
public static double div (double a,double b)throws MyException {

    if (b != 0) {
    	double result= a/b;
     } else {
        // Creation and call exception
        throw new MyException("We cannot divide by zero!");
      }
	
	double result= a/b;
	return  result; }

public static double  input (BufferedReader br)  throws  IOException, MyException   
	{	System.out.println("Input double number ");
		String	x = br.readLine();
	   isDigit(x);	
        double m1 = Double.parseDouble(x);
   	return m1 ;
}

	public static void main(String[] args)throws MyException, IOException {
		//Create method dive(),
	   //	which calculates the dividing of two double numbers. 
		//In main method input 2 double numbers and call this method.
		//Catch all exceptions. 
		BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));

		double x1 = input(br);
		double x2 = input(br);
		div (x1,x2);
	System.out.println("Result = "+div (x1,x2) );
	

	
	
	}

}
