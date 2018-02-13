package Les4HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les4HW3HTTPErMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please write a number of error what are you looking for");
		switch (br.readLine()) {
		case "400":
			System.out.println(HTTPEr.BadRequest);
			break;
		case "401":
			System.out.println(HTTPEr.Unauthorized);
			break;
		case "402":
			System.out.println(HTTPEr.PaymentRequired);
			break;
		case "403":
			System.out.println(HTTPEr.Forbidden);
			break;
		case "404":
			System.out.println(HTTPEr.NotFound);
			break;
		default:
			System.out.println("Wrong number of error");
			break;
		}

	}

}
