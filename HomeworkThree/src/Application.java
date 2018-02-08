import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    private float number;
    private int intNumb;

    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = 0;
        System.out.println("Enter three float numbers ");
        while (i < 3) {
            number = Float.parseFloat(br.readLine());
            i++;
            String string = ((number > -5) && (number < 5)) ? "Yes" : "No";
        }
        System.out.println("Enter three int numbers ");
        int k = 0;
        while (k < 3) {
            intNumb = Integer.parseInt(br.readLine());
            k++;
            if (intNumb < min) {
                min = intNumb;
            }
            if (intNumb > max) {
                max = intNumb;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);


    }

}
