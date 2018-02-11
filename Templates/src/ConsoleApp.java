import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
		
public class ConsoleApp {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

		double radius = Double.parseDouble(br.readLine());
		
		System.out.println("Text");

	}

}

//Double.parseDouble(currentBalanceStr.replaceAll(" ","."));
