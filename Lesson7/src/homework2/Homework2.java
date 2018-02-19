package homework2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Homework2 {

	public static void main(String[] args) throws ClassCastException {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Cristea", "Dragos");
		personMap.put("Ilonescu", "Stefan");
		personMap.put("Covaci", "Mircea");
		personMap.put("Florea", "Matei");
		personMap.put("Berceanu", "Maria");
		personMap.put("Cheban", "Maria");
		personMap.put("Balauru", "Vasile");
		personMap.put("Bratu", "Marcu");
		personMap.put("Constantinescu", "Alexandru");
		personMap.put("Ciocanu", "Petru");
		
		System.out.println(personMap);

		for(String firstName : personMap.values()) {
			int name = 0;
			for(Map.Entry<String, String> entry : personMap.entrySet()) {
				if(entry.getValue().equals(firstName)) { 
				name++;
				if(name >= 2) {
//					Не розумію, як змінити умову, щоб нижчий напис виводився лише один раз
					System.out.println("There are " + name + " people with name " + firstName);
				}
			}
		}	
		}
		
		for (Iterator rem = personMap.entrySet().iterator(); rem.hasNext();){
			 Map.Entry entry = (Map.Entry) rem.next();
			 if (entry.getValue().equals("Vasile")) {
				 rem.remove();
			 }
		}
			  
		System.out.println(personMap);
		
	}
}
