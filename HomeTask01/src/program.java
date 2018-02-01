import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class program {
	  public static void main(String[] args) throws IOException {
		    BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

//		System.out.println("input value of radius");
//		double radius = Double.parseDouble(br.readLine());
//		System.out.println("P =" + 2*3.1415926*radius);
//		System.out.println("S =" + 3.1415926* Math.pow( radius, 2));
		
		System.out.println("What is your name?");
		String name = br.readLine();
		System.out.println("Where are you live,"+ name);
		String adrs = br.readLine();
		System.out.println("Name: "+ name);
		System.out.println("address: "+ adrs);

		
		int c1 = Integer.parseInt(br.readLine());
		int c2 = Integer.parseInt(br.readLine());
		int c3 = Integer.parseInt(br.readLine());
		int t1 = Integer.parseInt(br.readLine());
		int t2 = Integer.parseInt(br.readLine());
		int t3 = Integer.parseInt(br.readLine());
		
		System.out.println("country 1 = " + c1 * t1);
		System.out.println("country 2 = " +c2 * t2);
		System.out.println(" country 3 = " +  c3 * t3);
		

		
		  }

}
