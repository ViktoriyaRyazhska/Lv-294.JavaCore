//read number of HTTP Error (400, 401,402, ...) and write the name of this error
//(Declare enum HTTPError)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum HTTPError {
	BadRequest, Unauthorized, PaymentRequired, Forbidden, NotFound, UnknownError
}

public class C1cEnum404 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader br = new BufferedReader(
	    		new InputStreamReader(System.in));
    
	    	System.out.println("Please, input number of HTTP client error status code (400-404):");
	    	int status = Integer.parseInt(br.readLine());
	    	
	    	HTTPError name;
 	   	
	    	
	    	switch (status) {
	    	case 400:
	    		name = HTTPError.BadRequest;break;
	    	case 401:
	    		name = HTTPError.Unauthorized;break;
	    	case 402:
	    		name = HTTPError.PaymentRequired;break;	
	    	case 403:
	    		name = HTTPError.Forbidden;break;		
	    	case 404:
	    		name = HTTPError.NotFound;break;
	    	default:
	    		name = HTTPError.UnknownError;break;
	    	}
	    	
	    	System.out.println("Name of error status code is " + name);
	    	
	}

}


/*An enum can have associated properties, like human-readable names, e.g.,

public enum CountryAndOneContinent {

    INDIA("India"),
    RUSSIA("Russia"),
    NORTH_AMERICA("North America");

    private String displayName;

    CountryAndOneContinent(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() { return displayName; }

    // Optionally and/or additionally, toString.
    @Override public String toString() { return displayName; }
}
I'm ambivalent about using toString to provide presentation-layer representations.

I prefer methods communicate their purpose explicitly–it's more expressive and obvious.

toString is pretty generic, and allows only a single representation. Multiple output formats may be required depending on context, parameters, etc. which toString doesn't allow.

Advantages of toString include using default string operations on the object, and in this case, using valueOf to directly translate from the human-readable version to the enum value.
*/


