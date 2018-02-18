package cw07;

import cw07.task2.EmployeeMap;

//import cw07.task1.MyCollection;

public class Main {
	public static void main(String[] args) {
		
//		MyCollection collection = new MyCollection();
//		collection.fillCollection(10, 50);
//		collection.print();
//		collection.remove(20);
//		collection.print();
//		int[] elements = { 1, -3, -4 };
//		int[] positions = { 2, 8, 5 };
//		collection.insert(elements, positions);
//		collection.print();
//		collection.sort();
//		collection.print();
		
		EmployeeMap map = new EmployeeMap(10);
		map.display();
		System.out.println("-------------------------------------------------------------------");
		map.findById();
		System.out.println("-------------------------------------------------------------------");
		map.findByName();
	}
}
