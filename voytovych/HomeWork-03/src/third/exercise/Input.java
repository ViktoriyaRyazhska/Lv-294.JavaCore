package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	public void show(BufferedReader br) throws NumberFormatException, IOException {
	
		System.out.println("Enter number of HTTP Error:");
		int number = Integer.parseInt(br.readLine());
		
		switch (number) {
		case 100:
			System.out.println("Code: " + HTTPError.Continue.getNumber());
			System.out.println("Description: " + HTTPError.Continue.getDescription());
			break;
		case 101:
			System.out.println("Code: " + HTTPError.SwitchingProtocols.getNumber());
			System.out.println("Description: " + HTTPError.SwitchingProtocols.getDescription());
			break;
		case 200:
			System.out.println("Code: " + HTTPError.OK.getNumber());
			System.out.println("Description: " + HTTPError.OK.getDescription());
			break;			
		case 201:
			System.out.println("Code: " + HTTPError.Created.getNumber());
			System.out.println("Description: " + HTTPError.Created.getDescription());
			break;
		case 202:
			System.out.println("Code: " + HTTPError.Accepted.getNumber());
			System.out.println("Description: " + HTTPError.Accepted.getDescription());
			break;
		case 300:
			System.out.println("Code: " + HTTPError.MultipleChoices.getNumber());
			System.out.println("Description: " + HTTPError.MultipleChoices.getDescription());
			break;
		case 301:
			System.out.println("Code: " + HTTPError.MovedPermanently.getNumber());
			System.out.println("Description: " + HTTPError.MovedPermanently.getDescription());
			break;			
		case 400:
			System.out.println("Code: " + HTTPError.BadRequest.getNumber());
			System.out.println("Description: " + HTTPError.BadRequest.getDescription());
			break;
		case 401:
			System.out.println("Code: " + HTTPError.Unauthorized.getNumber());
			System.out.println("Description: " + HTTPError.Unauthorized.getDescription());
			break;			
		case 402:
			System.out.println("Code: " + HTTPError.PaymentRequired.getNumber());
			System.out.println("Description: " + HTTPError.PaymentRequired.getDescription());
			break;
		case 500:
			System.out.println("Code: " + HTTPError.InternalServerError.getNumber());
			System.out.println("Description: " + HTTPError.InternalServerError.getDescription());
			break;	
		case 501:
			System.out.println("Code: " + HTTPError.NotImplemented.getNumber());
			System.out.println("Description: " + HTTPError.NotImplemented.getDescription());
			break;
		case 502:
			System.out.println("Code: " + HTTPError.BadGateway.getNumber());
			System.out.println("Description: " + HTTPError.BadGateway.getDescription());
			break;
			
		default:
			System.out.println("Wrong number!!!");
			break;
		}
	}
	
}
