import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1_2 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	    BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));


	System.out.println("Hello. What is your name?");
	String name = br.readLine();
	System.out.println("Where are you live" + name);
	String adress = br1.readLine();

	System.out.println("Name -  " + name);  
	System.out.println("Adress - " + adress);
	  }


}
