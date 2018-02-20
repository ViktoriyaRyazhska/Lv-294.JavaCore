package Task1;

import java.io.*;
import java.util.regex.*;


public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("-----1-----");
        String var = "good";
        String var1 = "Good morning";

        System.out.println(var1.toLowerCase().contains(var.toLowerCase()));
        System.out.println(var1.contains(var));

        System.out.println("-----2-----");
        System.out.println("Please enter surname, name and patronymic: ");
        String fullName = br.readLine();

        System.out.println("-----3-----");
        System.out.println("Please enter five username");
        String[] username = new String[5];
        String character = "[a-zA-Z_0-9]{3,15}";
        Pattern pattern = Pattern.compile(character);
        for (int i = 0; i < username.length; i++) {
            username[i] = br.readLine();
            Matcher matcher = pattern.matcher(username[i]);

            if (matcher.matches()) {
                System.out.println("Username: " + username[i] + " is valid.");
            } else {
                System.out.println("Username: " + username[i] + " is not valid.");
            }
        }
    }
}
