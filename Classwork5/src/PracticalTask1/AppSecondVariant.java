package PracticalTask1;

import java.util.ArrayList;
import java.util.Random;

public class AppSecondVariant {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = getRandomNumbers(10);
        int num;

        for (int i = 0; i < myCollection.size(); i++) {
            num = myCollection.get(i);
            System.out.println(num);
        }
    }

    private static ArrayList<Integer> getRandomNumbers(int sizeArray) {
        ArrayList<Integer> addNumb = new ArrayList<Integer>();

        Random rand = new Random();
        for (int i = 0; i < sizeArray; i++) {
            addNumb.add(rand.nextInt(10));
        }
        return addNumb;
    }
}
