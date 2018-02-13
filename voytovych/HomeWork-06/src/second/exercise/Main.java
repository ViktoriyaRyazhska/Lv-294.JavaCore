package second.exercise;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/*
		 * Create map personMap and add to it ten persons of type <String, String>
		 * (lastName, firstName). Output the entities of the map on the screen. There
		 * are at less two persons with the same firstName among these 10 people? Remove
		 * from the map person whose firstName is ”Orest” (or other). Print result.
		 */

		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Anderson", "John");
		personMap.put("Garcia", "Andrew");
		personMap.put("Marshall", "Joshua");
		personMap.put("Diaz", "Nicholas");
		personMap.put("Ross", "John");
		personMap.put("Rodriguez", "Christian");
		personMap.put("Scott", "Nicholas");
		personMap.put("King", "John");
		personMap.put("Collins", "Jack");
		personMap.put("King", "John");

		System.out.println("Entries before changings: ");
		ShowMap.show(personMap);

		System.out.println("\nNames that occur more than two times: ");
		FindNames.names(personMap);

		System.out.println("\nEntries after remove name \"John\": ");
		FindNames.remove(personMap, "John");
		ShowMap.show(personMap);

	}

}
