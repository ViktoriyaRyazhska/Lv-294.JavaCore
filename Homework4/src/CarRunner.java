import java.util.Scanner;

public class CarRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] car = new Car[4];
        car[0] = new Car("truck", 1995, 120);
        car[1] = new Car("crossover", 2000, 150);
        car[2] = new Car("sports car", 2010, 200);
        car[3] = new Car("hybrid", 2004, 170);
        System.out.println("---1---");
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

        System.out.println("---2---");
        System.out.println("Enter car year");
        int year = scanner.nextInt();
        for (int i = 0; i < car.length; i++) {
            if (year == car[i].getYear()) {
                System.out.println(car[i]);
            }
        }

        System.out.println("---3---");
        Car tmp;
        for (int i = 0; i < car.length - 1; i++) {
            for (int j = i + 1; j < car.length; j++) {
                if (car[i].getYear() > car[j].getYear()) {
                    tmp = car[i];
                    car[i] = car[j];
                    car[j] = tmp;
                }
            }
        }
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }

    }
}
