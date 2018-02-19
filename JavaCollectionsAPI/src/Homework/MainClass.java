package Homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new LinkedList<Student>();
		students.add(new Student("Vasya", 1));
		students.add(new Student("Igor", 2));
		students.add(new Student("Olena",2));
		students.add(new Student("Ylya", 3));
		students.add(new Student("Oleg", 4));
		
		System.out.println("\nSorted by name:");
		Collections.sort(students, Student.getSortbyName());
		students.forEach(student->{
			System.out.println(student);
		});
		
		System.out.println("\nSorted by course:");
		Collections.sort(students, Student.getSortbyCourse());
		students.forEach(student->{
			System.out.println(student);
		});
		
	}
	
	public static void f1() {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
	
		Set<Integer> union = union(set1,set2);
		for(Integer obj : union) {
			System.out.print(obj + " ");
		}
		System.out.println();
		Set<Integer> intersection = intersection(set1,set2);
		for(Integer obj : intersection) {
			System.out.print(obj + " ");
		}
	}
	public static <T> Set<T> union(Set<T> set1, Set<T> set2){
		Set<T> union = new HashSet<T>();
		union.addAll(set1);
		union.addAll(set2);
		return union; 
	}

	public static <T> Set<T> intersection(Set<T> set1, Set<T> set2){
		Set<T> intersection = new HashSet<T>(set1);
		intersection.retainAll(set2);

		/*Set<T> intersection = new HashSet<T>();
		for(T obj : set1) {
			if(set2.contains(obj)) {
				intersection.add(obj);
			}
		}*/
		
		return intersection;
	}
	
	public static void f2() {
		Map<String,String> personMap = new HashMap<String,String>();
		System.out.println("People:\n");
		personMap.put("Ivanov","Ivan");
		personMap.put("Pertov","Igor");
		personMap.put("Griinyk","Oleg");
		personMap.put("Fedchovych","Anna");
		personMap.put("Haliy","Taras");
		personMap.put("Sloboda","Yra");
		personMap.put("Hirnyk","Ivan");
		personMap.put("Nastosyak","Olya");
		personMap.put("Ijak","Orest");
		personMap.put("Laba","Oleg");
		
		for(Map.Entry<String,String> entry: personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		System.out.println("\n\n People with the same name: \n");
		Set<String> valueSet = new HashSet(personMap.values());
		
		for(String obj : valueSet) {
			int count = 0; 
			for(Map.Entry<String,String> entry: personMap.entrySet()) {
				if(entry.getValue().equals(obj)) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println("There are " + count + " people with name " + obj);
			}
		}
		
		
		System.out.println("\n\n Good bye,Orest!\n");
		Set<String> toDelete = new HashSet();
		for(Map.Entry<String, String> entry: personMap.entrySet()) {
			if(entry.getValue().equals("Orest")) {
				toDelete.add(entry.getKey());
			}
		}
		for(String key:toDelete) {
			personMap.remove(key);
		}
		
		
		for(Map.Entry<String,String> entry: personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
