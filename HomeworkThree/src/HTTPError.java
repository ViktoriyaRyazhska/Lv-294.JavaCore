import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public enum HTTPError {
    BAD_REQUEST,
    UNAUTHORISED,
    PAYMENT_REQUIRED,
    NOT_FOUND;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HTTPError error;
        System.out.println("Enter HTTP status codes");
        int code = Integer.parseInt(br.readLine());
        switch (code) {
            case 400:
                error = HTTPError.BAD_REQUEST;
                System.out.println(code + " - Bad Request");
                break;
            case 401:
                error = HTTPError.UNAUTHORISED;
                System.out.println(code + " - Unauthorized ");
                break;
            case 402:
                error = HTTPError.PAYMENT_REQUIRED;
                System.out.println(code + " - Payment Required");
                break;
            case 404:
                error = HTTPError.NOT_FOUND;
                System.out.println(code + " - Not Found");
                break;
            default:
                System.out.println("Don't know this code");
                System.exit(0);
        }
    }
}
