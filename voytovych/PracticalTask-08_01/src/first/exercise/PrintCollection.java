package first.exercise;

import java.util.List;

public class PrintCollection {
	public static void print(List<Integer> list) {
		int counter = 0;
		for (Integer number : list) {
			System.out.println("position: " + counter + ", value of element: " + number);
			counter++;
		}
	}
}
