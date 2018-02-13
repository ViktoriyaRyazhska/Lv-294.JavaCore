package first.exercise;

import java.util.Map;

public class ShowMap {

	public static void show(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> element : map.entrySet()) {
			System.out.println(element.getKey() + " " + element.getValue());
		}
	}
}
