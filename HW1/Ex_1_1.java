import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1_1 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));


	//System.out.println("Hello. What is your name?");
	//String name = br.readLine();
	System.out.println("Input R");
	//int r = Integer.parseInt(br.readLine());
	double r = Double.parseDouble(br.readLine());
    double p = 2*3.14*r;
    double s = 3.14*r*r;
	System.out.println("Perimeter  " + p);  
	System.out.println("Area " + s);
	  }

}
