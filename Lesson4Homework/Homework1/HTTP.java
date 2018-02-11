package homework1;

import java.util.Scanner;

public class HTTP {
	public static void main(int [] args) {
		
		System.out.println("Write number of HTTP Error");
		Scanner a = new Scanner(System.in);
		int error = a.nextInt();
		
		switch (error) {
		case 400:
			System.out.println(HTTPError.BAD_REQUEST); break;
		case 401:
			System.out.println(HTTPError.UNATHORIZAED); break;
		case 402:
			System.out.println(HTTPError.PAYMENT_REQUIRED); break;
		case 403:
			System.out.println(HTTPError.FORBIDDEN); break;
		case 404:
			System.out.println(HTTPError.NOT_FOUND); break;
		case 405:
			System.out.println(HTTPError.METHOD_NOT_ALLOWED); break;
		case 406:
			System.out.println(HTTPError.NOT_ACCEPTABLE); break;
		case 407:
			System.out.println(HTTPError.PROXY_AUTHENTICATION_REQUIRED); break;
		case 408:
			System.out.println(HTTPError.REQUEST_TIMEOUT); break;
		case 409:
			System.out.println(HTTPError.CONFLICT); break;
			default:
				System.out.println("Please write number of HTTP Error only in the range from 400 to 409");
		}
		
	}

}
