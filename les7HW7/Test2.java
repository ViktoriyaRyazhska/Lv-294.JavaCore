package les7HW7;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();

		personMap.put("Stetsk", "Orest");
		personMap.put("Skirya", "Bohdan");
		personMap.put("Dziuba", "Marta");
		personMap.put("Levko", "Victor");
		personMap.put("Oleksiuk", "Mariia");
		personMap.put("Cuborg", "Marta");
		personMap.put("Levandovi", "Marta");
		personMap.put("Putly", "Kateryna");
		personMap.put("Sokivka", "Alina");
		personMap.put("Diyak", "Marta");

		printMap(personMap);
		sameFirstName(personMap);
		removeFirstName(personMap);
	}

	public static void printMap(Map<String, String> map) {
		System.out.println(map);
	}

	public static void sameFirstName(Map<String, String> map) {
		String v = " ";

		Collection<String> list = map.values();
		for (String l : list) {
			int k = 0;
			for (Map.Entry<String, String> entry : map.entrySet()) {
				if (entry.getValue().equals(l)) {
					k++;

				}
			}
			if (k >= 2) {

				System.out.println("The name " + l + " was mentioned more than one time ");
			}

		}

	}

	public static void removeFirstName(Map<String, String> map) {
		String key = " ";
		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (entry.getValue().equals("Orest")) {
				key = entry.getKey();
				System.out.println("good");
			}
		}
		map.remove(key);
		printMap(map);

	}

}
