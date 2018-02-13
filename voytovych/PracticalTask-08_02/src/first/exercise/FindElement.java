package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;

public class FindElement {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void findID(Map<Integer, String> map) throws NumberFormatException, IOException {
		Integer id = Input.inputId(br);
		if (map.containsKey(id)) {
			System.out.println("We have element with ID " + id + ", " + " name " + map.get(id));
		}else {
			System.out.println("We don't have element with ID - " + id);
		}
	}

	public static void findName(Map<Integer, String> map) throws NumberFormatException, IOException {
		String name = Input.inputName(br);
		if (map.containsValue(name)) {
			System.out.println("We have element with name " + name + ", " + " ID " + findIDByValue(map, name));
		}else {
			
		}
	}
	
	public static Integer findIDByValue(Map<Integer, String> map, String value) {
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (Objects.equals(value, entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
}
