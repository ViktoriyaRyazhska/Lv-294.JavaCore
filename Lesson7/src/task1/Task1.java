package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
	public static void main(String[] args){
        List<Integer> myCollection = new ArrayList<Integer>(); 
        List<Integer> newCollection = new ArrayList<Integer>();
        Random rand = new Random();
        
        
        for(int i = 0; i < 10; i++) {
        	myCollection.add(rand.nextInt(30));
        }
        for(int i = 0; i < myCollection.size(); i++) {
        	if(myCollection.get(i) > 5) {
        		newCollection.add(i);
        	}
        }
        System.out.println(newCollection);
        
//        „омусь дуже виб≥рково забираЇ числа б≥льш≥ за 20
//        System.out.println(myCollection);
        for(int i = 0; i < myCollection.size(); i++)
        	if(myCollection.get(i) > 20) {
        		myCollection.remove(i);
        	}
        
        System.out.println(myCollection);
        
        myCollection.set(2, 1);
        if(myCollection.size() >= 9) {
        	myCollection.set(8, -3);
        }
        myCollection.set(5, -4);
        
        for(int i = 0; i < myCollection.size(); i++) {
        	System.out.println("Position - " + i + ", value of element - " + myCollection.get(i));
        }
        
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
