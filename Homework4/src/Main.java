import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("---1---");
        System.out.print("Enter the number of month. ");
        int monthNumber = Integer.parseInt(br.readLine());
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month_days.length; i++) {
            if (i == monthNumber - 1) {
                System.out.println("There are " + month_days[i] + " days.");
            }
        }

        System.out.println("---2---");
        System.out.println("Enter 10 int numbers. ");
        int[] tenInt = new int[10];
        for (int i = 0; i < tenInt.length; i++) {
            tenInt[i] = Integer.parseInt(br.readLine());
        }
        boolean positiveNumb = true;
        int sum = 0;
        int product = 1;
        for (int i = 0; i < tenInt.length / 2; i++) {
            if (tenInt[i] < 0) {
                positiveNumb = false;
                break;
            }
        }
        if (positiveNumb) {
            for (int i = 0; i < tenInt.length / 2; i++) {
                sum += tenInt[i];
            }
        } else {
            for (int i = 5; i < tenInt.length; i++) {
                product *= tenInt[i];
            }
        }
        int result = positiveNumb ? sum : product;
        System.out.println(result);


        System.out.println("---3---");
        System.out.println("Enter 5 int numbers. ");
        int[] fiveInt = new int[5];
        int count = 0;
        int position = 0;
        for (int i = 0; i < fiveInt.length; i++) {
            fiveInt[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < fiveInt.length; i++) {
            if (fiveInt[i] > 0) {
                count++;
                position = i;
            }
            if (count == 2) {
                break;
            }
        }
        if (!(count == 1 || count == 0)) {
            System.out.println("Position of second positive number is " + position+1);
        }
        int min = fiveInt[0];
        int imin = 0;
        int i = 0;
        while (i < fiveInt.length) {
            if (fiveInt[i] < min) {
                min = fiveInt[i];
                imin = i;
            }
            i++;
        }
        System.out.println("Minimum = " + min + " is in " + (imin + 1) + " place");

        System.out.println("---4---");
        int number = Integer.parseInt(br.readLine());
        int multiplication = 1;
        while (number > 0) {
            if (number % 2 == 0) {
                multiplication *= number;
            }
            number = Integer.parseInt(br.readLine());
        }
        System.out.println("Product = " + multiplication);
    }
}
