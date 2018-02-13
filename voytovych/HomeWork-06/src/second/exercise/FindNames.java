package second.exercise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindNames {

	public static void names(Map<String, String> map) throws NumberFormatException, IOException {
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();

		for (Map.Entry<String, String> mapVal : map.entrySet()) {
			if (!set.add(mapVal.getValue())) {
				list.add(mapVal.getValue());

			} else {
				set.add(mapVal.getValue());
			}
		}
		for (Map.Entry<String, String> mapVal : map.entrySet()) {

			if (list.contains(mapVal.getValue())) {

				System.out.println(mapVal.getValue() + " " + mapVal.getKey());
			}
		}
	}

	public static void remove(Map<String, String> map, String firstName) {
		for (Iterator<Map.Entry<String, String>> it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry<String, String> entry = it.next();
			if (entry.getValue().equals(firstName)) {
				it.remove();
			}
		}
	}
}
