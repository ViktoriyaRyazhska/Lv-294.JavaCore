package Les1HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1HW3 {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, write cost of phonecall from first country");
        double c1 = Double.parseDouble(b.readLine());
        System.out.println("Please, write the time how much the first phonecall takes");
	    double t1 = Double.parseDouble(b.readLine());
	    double ct1 = c1*t1;
	    System.out.println("Please, write cost of phonecall from second country");
        double c2 = Double.parseDouble(b.readLine());
        System.out.println("Please, write the time how much the second phonecall takes");
	    double t2 = Double.parseDouble(b.readLine());
	    double ct2 = c2*t2;
	    System.out.println("Please, write cost of phonecall from third country");
        double c3 = Double.parseDouble(b.readLine());
        System.out.println("Please, write the time how much the third phonecall takes");
	    double t3 = Double.parseDouble(b.readLine());
	    double ct3 = c3*t3;
	    System.out.println("Computer will count for first call " + ct1);
	    System.out.println("Computer will count for first call " + ct2);
	    System.out.println("Computer will count for first call " + ct3);
	    double ct = ct1+ct2+ct3;
	    System.out.println("Computer will count for all talk together "+ ct);
	    
	}

}
