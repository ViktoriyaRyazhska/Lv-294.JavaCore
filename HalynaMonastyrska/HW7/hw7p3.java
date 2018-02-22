import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw7p3 {
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter few currency and US currency among them with $ at the beginning, dot and two digits after the dot");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String currency = in.nextLine();
		String pattern = "\\$(\\d*)(\\.\\d{2})?";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(currency);
		while (m.find()) {
			System.out.print("US currency (rounded up) is: " + currency.substring(m.start(), m.end()) + "*");
		}
	}
}