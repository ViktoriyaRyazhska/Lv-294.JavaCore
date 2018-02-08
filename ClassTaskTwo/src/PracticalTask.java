import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalTask {
    int number;
    int countOdd = 0;


    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        System.out.println("Enter three numbers ");
        while (i <= 3) {
            System.out.print(i + " number = ");
            number = Integer.parseInt(br.readLine());
            i++;
            if (number % 2 != 0) {
                countOdd++;
            }
        }
        System.out.println("Odd: " + countOdd);
        System.out.println();
        System.out.print("Number of the day of the week is ");
        int weekDays = Integer.parseInt(br.readLine());
        System.out.print("Понеділок \n Monday \n 月曜日");
    }


}
