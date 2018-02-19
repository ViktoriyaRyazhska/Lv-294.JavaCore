package lesson7;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map <Integer, String> employeeMap = new HashMap <Integer, String>();

		employeeMap.put(5454, "Dobrostan");
		employeeMap.put(45646, "Skiryak");
		employeeMap.put(98257, "Levkovich");
		employeeMap.put(32489, "Cuborg");
		employeeMap.put(78923, "Sokivka");
		employeeMap.put(21544, "Kit");
		employeeMap.put(12458, "Levandovich");
		
		displaymap(employeeMap);
		findById(br, employeeMap);
		findByName(br, employeeMap);
		
	}
	public static void displaymap(Map<Integer, String> map) {
		System.out.println(map.toString());
	}
	
	public static void findById(BufferedReader br, Map<Integer, String> map) throws NumberFormatException, IOException {
		System.out.println("Please, write Id of person what are you looking for");
		
		Integer i = Integer.parseInt(br.readLine());
		if(map.containsKey(i)) {
		System.out.println("Pesron is "+map.get(i));
	}
		else {
			System.out.println("I can`t find this ID");
		}
	}
	public static void findByName(BufferedReader br, Map<Integer, String> map) throws IOException {
		System.out.println("Please, write a Name of Id what are you looking for");
		String name = br.readLine();
		if(map.containsValue(name)) {
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				if(entry.getValue().contains(name)) {
					System.out.println("Id is " + entry.getKey());
				}
			}
		}
		else {
			System.out.println("I can`t find this Name");
		}
	}
	
	

}
