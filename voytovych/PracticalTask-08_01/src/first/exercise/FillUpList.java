package first.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FillUpList {
	
	private static List<Integer> myCollection;
	
	public static List<Integer> list(){
		myCollection = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			myCollection.add(randomFill());	
		}
		return myCollection;
	}
	
	public static int randomFill() {
		Random rand = new Random();
		int randomNum = rand.nextInt(30);
		return randomNum;
	}
}
