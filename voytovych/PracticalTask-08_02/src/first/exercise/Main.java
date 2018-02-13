package first.exercise;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* In the main() method declare map employeeMap of pairs <Integer, String>. 
		 * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen. 
		 * Ask user to enter ID, then find and write corresponding name from your map. If you can't 
		   find this ID - say about it to user (use function containsKey()).
		 *  Ask user to enter name, verify than you have name in your map
		    and write corresponding ID. If you can't find this name - say about it to user 
		    (use function containsValue()).*/
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(101, "James");
		employeeMap.put(102, "William");
		employeeMap.put(103, "Michael");
		employeeMap.put(104, "Alexander");
		employeeMap.put(105, "Daniel");
		employeeMap.put(106, "David");
		employeeMap.put(107, "Henry");
		
		ShowMap.show(employeeMap);
		
		FindElement.findID(employeeMap);
		FindElement.findName(employeeMap);
		
	}

}
