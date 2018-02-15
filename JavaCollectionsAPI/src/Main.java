import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Map<Integer,String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Oleg");
		employeeMap.put(2, "Igor");
		employeeMap.put(3, "Oleksandr");
		employeeMap.put(4, "Anna");
		employeeMap.put(5, "Maria");
		employeeMap.put(6, "Ivan");
		employeeMap.put(7, "Oleksiy");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please,enter the ID");
		int ID = Integer.parseInt(reader.readLine());
		if(employeeMap.containsKey(ID)) {
			for(Map.Entry<Integer,String> entry : employeeMap.entrySet()) {
				if(entry.getKey().equals(ID)) {
					System.out.println(entry.getValue());
				}
			}
		}else {
			System.out.println("This ID doesn't exist");
		}
		System.out.println("Enter the name");
		String name = reader.readLine();
		if(employeeMap.containsValue(ID)) {
			for(Map.Entry<Integer,String> entry : employeeMap.entrySet()) {
				if(entry.getValue().equals(name)) {
					System.out.println(entry.getKey());
				}
			}
		}else {
			System.out.println("This ID doesn't exist");
		}
	}
	
	
	
	
	
	
	
	public static void f1() {
		List<Integer> myCollection = new ArrayList();
		List<Integer> newCollection = new ArrayList();
		Random rand = new Random();
		for(int i = 0; i < 10;i++) {
			myCollection.add(rand.nextInt(25) + 1);
		}
		for(int i = 0;i < myCollection.size();i++) {
			if(myCollection.get(i) > 5) {
				newCollection.add(i);
			}
		}
		for(int i = 0;i < myCollection.size();i++) {
			System.out.print(myCollection.get(i) + " ");
		}
		
		for(int i = 0;i < myCollection.size();i++) {
			if(myCollection.get(i) > 20) {
				myCollection.remove(i);
			}
		}
		
		
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5,-4);
		System.out.println();
		Collections.sort(myCollection);
		for(int i = 0;i < myCollection.size();i++) {
			System.out.print(myCollection.get(i) + " ");
		}
	}

}
