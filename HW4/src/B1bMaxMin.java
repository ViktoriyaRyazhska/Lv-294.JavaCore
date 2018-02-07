import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1bMaxMin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));

	    	System.out.println("Please, input three integer numbers:");
	    	
	    	int a = Integer.parseInt(br.readLine());
	    	int min=a;
	    	int max=a;   
	    	
	    	int b = Integer.parseInt(br.readLine());
	    	if (b>max) 
	    		max=b; 
	    	else 
	    		min=b;
	    	
	    	int c = Integer.parseInt(br.readLine());
	    	if (c>max)
	    		max=c;
	    	else if (c<min)
	    		min=c;
	 	    	
	    	System.out.println("Minimal value is: "+ min);
	    	System.out.println("Maximal value is: "+ max);   	
	}

}
