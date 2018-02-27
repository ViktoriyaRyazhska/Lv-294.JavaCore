import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static double div(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter first double number:");
            double a = Double.parseDouble(br.readLine());
            
            System.out.println("Enter second double number:");
            double b = Double.parseDouble(br.readLine());
            
            System.out.println("Result: " + div(a, b));
        } catch (NumberFormatException e) {
            System.out.println("Wrong double number!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Failed to read the number!");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("Division exception!");
            e.printStackTrace();
        }
    }
}
