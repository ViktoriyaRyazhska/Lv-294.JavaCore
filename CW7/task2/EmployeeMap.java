package cw07.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import myScanner.MyScaner;

public class EmployeeMap {
	private Map<Integer, String> employees;
	private static Integer id;
	private MyScaner sc = new MyScaner();

	public EmployeeMap(int number) {
		employees = new HashMap<Integer, String>();
		String name;
		id = 0;
		for (int i = 0; i < number; i++) {
			name = sc.inputName();
			employees.put(id, name);
			++id;
		}
	}

	public Map<Integer, String> getEmployees() {
		return employees;
	}

	public void setEmployees(Map<Integer, String> employees) {
		this.employees = employees;
	}

	public void close() {
		sc.close();
	}

	public void display() {
		Iterator<Entry<Integer, String>> iterator = employees.entrySet()
				.iterator();
		Entry<Integer, String> entry;
		while (iterator.hasNext()) {
			entry = iterator.next();
			System.out.println("Employee [ id: " + entry.getKey() + " - "
					+ entry.getValue() + "]");
		}
	}

	public void findById() {
		System.out.println("Enter an ID of Employee :");
		int id = sc.inputIntNumbers();
		if (employees.containsKey(id)) {
			Iterator<Entry<Integer, String>> iterator = employees.entrySet()
					.iterator();
			Entry<Integer, String> entry;
			while (iterator.hasNext()) {
				entry = iterator.next();
				if (entry.getKey() == id) {
					System.out.println("Employee [ id: " + entry.getKey()
							+ " - " + entry.getValue() + "]");
				}
			}
		} else {
			System.out.println("There is no any Employee with ID : " + id);
		}
	}

	public void findByName() {
		System.out.println("Enter a Name of Employee :");
		String name = sc.inputName();
		if (employees.containsValue(name)) {
			Iterator<Entry<Integer, String>> iterator = employees.entrySet()
					.iterator();
			Entry<Integer, String> entry;
			while (iterator.hasNext()) {
				entry = iterator.next();
				if (entry.getValue().equals(name)) {
					System.out.println("Employee [ id: " + entry.getKey()
							+ " - " + entry.getValue() + "]");
				}
			}
		} else {
			System.out.println("There is no any Employee with Name : " + name);
		}
	}
}
