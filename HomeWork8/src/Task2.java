import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static int readNumber(int start, int end) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter number in range [" + start + ", " + end + "]:");
        int number = Integer.parseInt(br.readLine());
        
        if (!(start <= number && number <= end)) {
            throw new RuntimeException("Number is out of range [" + start + ", " + end + "]");
        }
        
        return number; 
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        for (int i = 0; i < 10; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;
            int number = readNumber(start, end);
            System.out.println("You have entered: " + number);
        }
    }
}
