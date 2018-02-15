import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.LinkedList;

/*
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
Remove from collection myCollection elements, which are greater then 20. Print result
Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection 
 */

public class App {
    public static void main(String[] args) {
        int listSize = 10;
        Random rand = new Random();
        System.out.println("-----1-----");
        List<Integer> myCollection = new ArrayList<Integer>();

        for (int i = 0; i < listSize; i++) {
            myCollection.add(rand.nextInt(10));
        }

        System.out.println(myCollection);

        System.out.println();
        System.out.println("-----2-----");

        List<Integer> newCollection = new LinkedList<Integer>();
        for (int i = 0; i < myCollection.size(); i++) {

            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);
        System.out.println();
        System.out.println("-----3-----");
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                myCollection.remove(i);
                i--;
            }
        }
        System.out.println(myCollection);
        System.out.println();
        System.out.println("-----4-----");

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println(myCollection);


    }
}