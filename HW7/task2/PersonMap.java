package hw07.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import myScanner.MyScaner;

public class PersonMap {
	private Map<String, String> persons = new HashMap<String, String>();
	private MyScaner sc = new MyScaner();
	private Iterator<Entry<String, String>> iterator;
	private Entry<String, String> entry;

	public PersonMap() {

	}

	public PersonMap(int number) {
		String firstName;
		String lastName;
		for (int i = 0; i < number; i++) {
			System.out.println("Enter first name :");
			firstName = sc.inputName();
			System.out.println("Enter last name : ");
			lastName = sc.inputName();
			persons.put(lastName, firstName);
			System.out.println("--------next--------");
		}
	}

	public Map<String, String> getPersons() {
		return persons;
	}

	public void setPersons(Map<String, String> persons) {
		this.persons = persons;
	}

	public void display() {
		iterator = persons.entrySet().iterator();
		while (iterator.hasNext()) {
			entry = iterator.next();
			System.out.println("[ " + entry.getKey() + " " + entry.getValue()
					+ " ]");

		}
	}

	public void isTwoFirstName() {
		List<String> valueList = new ArrayList<String>();
		Set<String> tempValueList = new HashSet<String>();
		valueList.addAll(persons.values());
		tempValueList.addAll(valueList);
		int count = 0;
		if ((valueList.size() - tempValueList.size()) != 0) {
			for (String tempName : tempValueList) {
				count = 0;
				for (String name : valueList) {
					if (tempName.equals(name)) {
						count++;
					}
				}
				if (count > 1) {

					System.out.println(" The first name " + tempName
							+ " repeats " + --count + " times. ");
				}
			}
		} else {
			System.out
					.println(" There is no two same first names in this map.");
		}
	}

	public void remove(String firstName) {
		iterator = persons.entrySet().iterator();
		Set<String> keys = new HashSet<String>();
		while (iterator.hasNext()) {
			entry = iterator.next();
			if (entry.getValue().equals(firstName)) {
				keys.add(entry.getKey());
				System.out.println("[ " + entry.getKey() + " "
						+ entry.getValue() + " ] --- deleted!");
			}
		}
		for (String key : keys) {
			persons.remove(key);
		}
		System.out.println("---------------------------------------------");
		display();
	}
}
