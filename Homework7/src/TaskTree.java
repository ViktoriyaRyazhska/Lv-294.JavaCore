import java.io.*;
import java.util.regex.*;

public class TaskTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter US currency");
        String money = br.readLine();
        String pattern = "\\$[0-9]*\\.[0-9]{2}?";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(money);

        if (m.matches()) {
            System.out.print("Entered US currency: ");
            m.reset();
            System.out.println(money);
        } else {
            System.out.print("Sorry you entered wrong data");
        }
    }

}
