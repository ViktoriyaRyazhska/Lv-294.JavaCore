package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		List<Integer> myCollection = new LinkedList<Integer>();

		List<Integer> myC = new ArrayList<Integer>(11);

		System.out.println(create(myCollection));
		System.out.println(findandsave(myCollection));
		System.out.println(removefromC(myCollection));
		myC = insertEl(myCollection, myC);
		sort(myC);
	}

	public static List<Integer> create(List<Integer> list) {
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			int x = rand.nextInt(100);
			list.add(x);

		}
		return list;

	}

	public static List<Integer> findandsave(List<Integer> list) {
		List<Integer> newCollection = new LinkedList<Integer>();
		for (Integer l : list) {
			if (l > 5) {
				newCollection.add(l);

			}
		}

		return newCollection;

	}

	public static List<Integer> removefromC(List<Integer> list) {
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer i = it.next();
			if (i > 20) {
				it.remove();
			}
		}
		return list;
	}

	public static List<Integer> insertEl(List<Integer> list, List<Integer> myC) {
//Не знала як вирішити проблему з додаванням у колекцію, яка має мало елементів. Тому створила нову і на місця, які є пустими додала нуль
		myC.addAll(list);
		if ((myC.size() < 2) | (myC.size() < 5) | (myC.size() < 8)) {
			for (int i = myC.size(); i < 11; i++) {
				myC.add(i, 0);
			}
		}
		myC.set(2, 1);
		myC.set(5, -4);
		myC.set(8, -3);
		print(myC);
		return myC;

	}

	public static void print(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("position " + i + " value of element " + list.get(i));
		}
	}

	public static void sort(List<Integer> list) {
		Collections.sort(list);
		System.out.println(list);

	}

}
