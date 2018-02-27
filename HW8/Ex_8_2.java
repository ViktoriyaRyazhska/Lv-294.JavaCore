package HW8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex_8_2 {
	private static boolean isDigit(String s) throws MyException {
  		try {
       
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException e) {
	throw new MyException("Inputed value is not integer!");
       
    }
	
}	
	
public static int	readNumber (int start, int end) throws IOException, MyException   
	{BufferedReader br = new BufferedReader(
    		new InputStreamReader(System.in)); 
	System.out.println("Input integer number ");
	String	x = br.readLine();
   isDigit(x);	
    int n = Integer.parseInt(x);
    if ((n > start) & (n<end)) {
    	return(n);
     } else {
        // Creation and call exception
        throw new MyException("The number is not in the range ["+start+"...."+end+"]");
        		
     }   

    
    
		
	}
	
	
	
	public static void main(String[] args) throws IOException, MyException {
		int arr[ ]  = new int[10];

		
		BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));
		
		System.out.println("Input start number ");
		String	ar = br.readLine();
	   isDigit(ar);	
	    int start = Integer.parseInt(ar);
	    System.out.println("Input end number ");
	    String	brange = br.readLine();
		   isDigit(brange);	
		    int end = Integer.parseInt(brange);
		
		int i=0;
		while (i<10)
		{
			arr[i]=readNumber (start, end);
			
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
		}
	
}
