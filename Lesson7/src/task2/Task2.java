package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

	public static void main(String[] args) throws IOException {
		

		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(53, "Laurentiu");
		employeeMap.put(33, "Nicolae");
		employeeMap.put(80, "Dragos");
		employeeMap.put(03, "Maria");
		employeeMap.put(55, "Mircea");
		employeeMap.put(32, "Anica");
		employeeMap.put(38, "Alexandru");

		System.out.println(employeeMap);
		
		System.out.println("Enter ID of employee");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int id = Integer.parseInt(br.readLine());
		if(employeeMap.containsKey(id)) {
			for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if(id == entry.getKey()) {
				System.out.println(entry.getValue());
			} 	
			}
		} else {
			System.out.println("The employee with this id doesn't exist!");
		}
		
		System.out.println("Enter the name of employee");
		String name = br.readLine();
		if(employeeMap.containsValue(name)) {
			for(Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println(entry.getKey());
				}
			}
		} else {
			System.out.println("The employee with this name doesn't exist!");
		}
		

	}

}
