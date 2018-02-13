package second.exercise;

import java.util.Map;

public class ShowMap {

	public static void show(Map<String, String> map) {
		for (Map.Entry<String, String> element : map.entrySet()) {
			System.out.println(element.getValue() + " " + element.getKey());
		}
	}
}
